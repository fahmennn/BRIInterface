package com.nttdata.id.briinterface.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
// import com.ibm.disthub2.impl.formats.OldEnvelop.payload.normal.body.jms.JMSCorrelationID.is;
import com.nttdata.id.briinterface.utils.MQTimeoutException;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class MQService {

    private final JmsTemplate jmsTemplate;
    private final XmlMapper xmlMapper;
    private final ConcurrentMap<String, String> responseMap = new ConcurrentHashMap<>();
    private Connection connection = null;
    private Session session = null;
    private MessageProducer producer = null;
    private MessageConsumer consumer = null;
    // private static final Logger logger = LoggerFactory.getLogger(TestingThreadpoolService.class);


    @Autowired
    public MQService(JmsTemplate jmsTemplate, XmlMapper xmlMapper) {
        this.jmsTemplate = jmsTemplate;
        this.xmlMapper = xmlMapper;
    }

    public XmlMapper getXmlMapper() {
        return xmlMapper;
    }

    public void sendToQueue(String queueName, String message, String correlationId, AtomicBoolean isCancelled) {
        System.out.println("This is xml request to Send : " + message);
        jmsTemplate.convertAndSend(queueName, message, postProcessor -> {
            if (isCancelled.get()) {
                System.out.println("Thread was interrupted, exiting sendToQueue.");
                Thread.currentThread().interrupt();
                return postProcessor; // Returning the same postProcessor to exit early
            }
            
            System.out.println("Successfully sent message to queue: " + queueName);
            postProcessor.setJMSCorrelationID(correlationId);
            return postProcessor;
        });
    }
    
   

    // public String receiveFromQueue(String queueName, String expectedCorrelationId) {
    //     jmsTemplate.setReceiveTimeout(1000); // Set receive timeout to 1 second for polling
        
    //     long startTime = System.currentTimeMillis();
    //     while (System.currentTimeMillis() - startTime < 60000) {
    //         // Create a message selector string
    //         String messageSelector = "JMSCorrelationID = '" + expectedCorrelationId + "'";
            
    //         // Receive the message with the specified selector
    //         Message message = jmsTemplate.receiveSelected(queueName, messageSelector);
    //         System.out.println("Received message: " + message);
            
    //         if (message != null && message instanceof TextMessage) {
    //             TextMessage textMessage = (TextMessage) message;
    //             try {
    //                 String correlationId = textMessage.getJMSCorrelationID();
    //                 if (expectedCorrelationId.equals(correlationId)) {
    //                     String xmlResponse = textMessage.getText();
    //                     responseMap.put(correlationId, xmlResponse);
    //                     System.out.println("Correlation ID matched: " + correlationId);
    //                     return xmlResponse; // Return the response immediately
    //                 } else {
    //                     System.out.println("Correlation ID did not match. Expected: " + expectedCorrelationId + ", but got: " + correlationId);
    //                 }
    //             } catch (JMSException e) {
    //                 throw new RuntimeException("Failed to receive message from queue", e);
    //             }
    //         }
    //         try {
    //             Thread.sleep(100); // Polling interval
    //         } catch (InterruptedException e) {
    //             Thread.currentThread().interrupt();
    //             throw new RuntimeException("Thread interrupted while waiting for MQ response", e);
    //         }
    //     }
    //     throw new RuntimeException("Timeout waiting for response with correlation ID: " + expectedCorrelationId);
    // }

    public String receiveFromQueue(String queueName, String expectedCorrelationId, AtomicBoolean isCancelled) {
        while (!isCancelled.get()) {
            if (isCancelled.get()) {
                Thread.interrupted();
                return null;
            } else {
                String messageSelector = "JMSCorrelationID = '" + expectedCorrelationId + "'";
                Message message = jmsTemplate.receiveSelected(queueName, messageSelector);
                if (message instanceof TextMessage) {
                    TextMessage textMessage = (TextMessage) message;
                    try {
                        String correlationId = textMessage.getJMSCorrelationID();
                        if (expectedCorrelationId.equals(correlationId)) {
                            String xmlResponse = textMessage.getText();
                            responseMap.put(correlationId, xmlResponse);
                            System.out.println("Correlation ID matched: " + correlationId);
                            return xmlResponse; // Return the response immediately
                        } else {
                            System.out.println("Correlation ID did not match. Expected: " + expectedCorrelationId + ", but got: " + correlationId);
                        }
                    } catch (JMSException e) {
                    	System.out.println("-----------ERror MQ-----------");
                        throw new RuntimeException("Failed to process received message from queue", e);
                    }
                } else {
                    System.out.println("Received non-text message. Ignoring...");
                }
            }
            // if (message instanceof TextMessage) {
            //     TextMessage textMessage = (TextMessage) message;
            //     try {
            //         String correlationId = textMessage.getJMSCorrelationID();
            //         if (expectedCorrelationId.equals(correlationId)) {
            //             String xmlResponse = textMessage.getText();
            //             responseMap.put(correlationId, xmlResponse);
            //             System.out.println("Correlation ID matched: " + correlationId);
            //             return xmlResponse; // Return the response immediately
            //         } else {
            //             System.out.println("Correlation ID did not match. Expected: " + expectedCorrelationId + ", but got: " + correlationId);
            //         }
            //     } catch (JMSException e) {
            //         throw new RuntimeException("Failed to process received message from queue", e);
            //     }
            // } else {
            //     System.out.println("Received non-text message. Ignoring...");
            // }
    
    
            try {
                Thread.sleep(10); // Polling interval
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Thread interrupted while waiting for MQ response", e);
            }
        }
    
        throw new MQTimeoutException("Timeout waiting for response with correlation ID: " + expectedCorrelationId);
    }
    
    public String getResponse(String correlationId) {
        // Wait for the response with the same correlation ID
        while (!responseMap.containsKey(correlationId)) {
            try {
                Thread.sleep(100); // Polling interval
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Thread interrupted while waiting for MQ response", e);
            }
        }
        return responseMap.remove(correlationId);
    }

    public String generateCorrelationId() {
        return java.util.UUID.randomUUID().toString();
    }
}