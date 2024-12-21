package com.nttdata.id.briinterface.model.mysql;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "api_log")
public class ApiLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;

	@Column(name = "LogType")
	private String logType;

	@Column(name = "EndpointPath")
	private String endpointPath;

	@Lob
	@Column(name = "PayloadContent")
	private String payloadContent;

	@Column(name = "LogTimestamp")
	private LocalDateTime logTimestamp;

	@Column(name = "correlationid")
	private String correlationId;

	@Column(name = "ClientIpAddress")
	private String clientIpAddress;

	@Column(name = "UserInformation")
	private String userInformation;

	// Getter & Setter
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getEndpointPath() {
		return endpointPath;
	}

	public void setEndpointPath(String endpointPath) {
		this.endpointPath = endpointPath;
	}

	public String getPayloadContent() {
		return payloadContent;
	}

	public void setPayloadContent(String payloadContent) {
		this.payloadContent = payloadContent;
	}

	public LocalDateTime getLogTimestamp() {
		return logTimestamp;
	}

	public void setLogTimestamp(LocalDateTime logTimestamp) {
		this.logTimestamp = logTimestamp;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public String getClientIpAddress() {
		return clientIpAddress;
	}

	public void setClientIpAddress(String clientIpAddress) {
		this.clientIpAddress = clientIpAddress;
	}

	public String getUserInformation() {
		return userInformation;
	}

	public void setUserInformation(String userInformation) {
		this.userInformation = userInformation;
	}

}