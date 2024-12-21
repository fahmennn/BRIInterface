package com.nttdata.id.briinterface.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import com.ibm.mq.jms.MQConnectionFactory;
import com.ibm.msg.client.wmq.WMQConstants;

@Configuration
@EnableJms
@DependsOn("ConfigLoader")
public class MQConfig {
	
	@Value("${ibm_mq_queue_manager_name}")
    private String mqManager;
	
	@Value("${ibm_mq_channel}")
    private String mqChannel;
	
	@Value("${ibm_mq_connection_name}")
    private String mqConn;
	
	@Value("${ibm_mq_user}")
    private String mqUser;
	
	@Value("${ibm_mq_password}")
    private String mqPassword;
	
	
    @Bean
    public MQConnectionFactory mqConnectionFactory() {
        MQConnectionFactory mqConnectionFactory = new MQConnectionFactory();
        try {
            mqConnectionFactory.setTransportType(WMQConstants.WMQ_CM_CLIENT);
            mqConnectionFactory.setQueueManager(mqManager);
            mqConnectionFactory.setChannel(mqChannel);
            mqConnectionFactory.setConnectionNameList(mqConn);
            mqConnectionFactory.setStringProperty(WMQConstants.USERID, mqUser);
            mqConnectionFactory.setStringProperty(WMQConstants.PASSWORD, mqPassword);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create MQConnectionFactory", e);
        }
        return mqConnectionFactory;
    }

    @Bean
    public CachingConnectionFactory cachingConnectionFactory(MQConnectionFactory mqConnectionFactory) {
        return new CachingConnectionFactory(mqConnectionFactory);
    }

    @Bean
    // @DependsOn("testConnection")
    public JmsTemplate jmsTemplate(CachingConnectionFactory cachingConnectionFactory) {
        JmsTemplate jmsTemplate = new JmsTemplate(cachingConnectionFactory);
        jmsTemplate.setReceiveTimeout(10); // Set receive timeout to 10 seconds
        return jmsTemplate;
    }

    // @Bean
    // public void testConnection() {
    //     try {
    //         // Coba membuat koneksi untuk menguji apakah bisa terhubung ke MQ
    //         MQConnectionFactory mqConnectionFactory = mqConnectionFactory();
    //         mqConnectionFactory.createConnection().close();
    //         System.out.println("Connection to IBM MQ was successful.");
    //     } catch (Exception e) {
    //         throw new RuntimeException("Failed to connect to IBM MQ: " + e.getMessage(), e);
    //     }
    // }

}
