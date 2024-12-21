package com.nttdata.id.briinterface.model.mysql;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "error_log")
public class LogErrorModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LogId")
    private Integer logId;

    @Column(name = "APICorrelationID")
    private String apiCorrelationId;

    @Column(name = "ApplicationName")
    private String applicationName;

    @Column(name = "Source")
    private String source;
    
    @Column(name = "Message")
    private String message;

    @Column(name = "LogDate")
    private LocalDateTime logDate;

    // Getters and Setters
    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getApiCorrelationId() {
        return apiCorrelationId;
    }

    public void setApiCorrelationId(String apiCorrelationId) {
        this.apiCorrelationId = apiCorrelationId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getLogDate() {
        return logDate;
    }

    public void setLogDate(LocalDateTime logDate) {
        this.logDate = logDate;
    }

}
