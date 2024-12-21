package com.nttdata.id.briinterface.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.dao.DataAccessException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.nttdata.id.briinterface.model.Mahasiswa;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
@DependsOn("ConfigLoader")
public class MahasiswaService {

    private MQService mqService;
    

    @Value("${ibm_mq_incoming_queue_name}")
    private String inputQueue;

    @Value("${ibm_mq_outgoing_queue_name}")
    private String outputQueue;

    @Autowired
    public void setMqService(@Lazy MQService mqService) {
        this.mqService = mqService;
    }

    @Async("busyTaskExecutor")
    public CompletableFuture<Mahasiswa> busyProcessInquiry(Mahasiswa mahasiswa) {
        AtomicBoolean isCancelled = new AtomicBoolean(false);
    	try {
    		// Logika untuk memproses inquiry mahasiswa
            String correlationId = mqService.generateCorrelationId();
            String xmlRequest = convertToXml(mahasiswa);
            System.out.println("ini corr id req" + correlationId.getBytes());
            mqService.sendToQueue(inputQueue, xmlRequest, correlationId, isCancelled);
            String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId, isCancelled);
            Mahasiswa result = convertToMahasiswa(xmlResponse);
            return CompletableFuture.completedFuture(result);
    	} catch (DataAccessException e) {
            throw e; // Rethrow the exception if necessary
        } catch (Exception e) {
            throw e; // Rethrow the exception if necessary
        }
        
    }

    @Async("idleTaskExecutor")
    public CompletableFuture<Mahasiswa> idleProcessInquiry(Mahasiswa mahasiswa) {
        AtomicBoolean isCancelled = new AtomicBoolean(false);
    	try {
    		// Logika untuk memproses inquiry mahasiswa
            String correlationId = mqService.generateCorrelationId();
            String xmlRequest = convertToXml(mahasiswa);
            System.out.println("ini corr id req" + correlationId.getBytes());
            mqService.sendToQueue(inputQueue, xmlRequest, correlationId, isCancelled);
            String xmlResponse = mqService.receiveFromQueue(outputQueue, correlationId, isCancelled);
            Mahasiswa result = convertToMahasiswa(xmlResponse);
            return CompletableFuture.completedFuture(result);
    	} catch (DataAccessException e) {
            throw e; // Rethrow the exception if necessary
        } catch (Exception e) {
            throw e; // Rethrow the exception if necessary
        }
        
    }
    
    @Async("gatewayA")
    public void gatewayA() {
        
    }
    
    @Async("gatewayB")
    public void gatewayB() {
        
    }

    private String convertToXml(Mahasiswa mahasiswa) {
        try {
            return mqService.getXmlMapper().writeValueAsString(mahasiswa);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert Mahasiswa to XML", e);
        }
    }

    private Mahasiswa convertToMahasiswa(String xmlResponse) {
        try {
            return mqService.getXmlMapper().readValue(xmlResponse, Mahasiswa.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert XML to Mahasiswa", e);
        }
    }
}