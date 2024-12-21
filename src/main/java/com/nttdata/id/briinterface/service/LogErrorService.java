package com.nttdata.id.briinterface.service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.id.briinterface.repository.mysql.LogErrorRepository;
import com.nttdata.id.briinterface.model.mysql.LogErrorModel;

@Service
public class LogErrorService {

	@Autowired
    private LogErrorRepository logErrorRepository;
	
	public LogErrorModel saveLogError(String apiCorrelationId, String applicationName, String source, String message) {
        LogErrorModel logError = new LogErrorModel();
        logError.setApiCorrelationId(apiCorrelationId);
        logError.setApplicationName(applicationName);
        logError.setSource(source);
        logError.setMessage(message);
        logError.setLogDate(LocalDateTime.now(ZoneOffset.systemDefault()));
        
        return logErrorRepository.save(logError);
    }
	
}
