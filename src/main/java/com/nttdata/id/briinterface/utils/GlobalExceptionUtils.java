package com.nttdata.id.briinterface.utils;

import java.sql.SQLException;
import java.util.concurrent.TimeoutException;

import javax.servlet.http.HttpServletResponse;

import org.hibernate.exception.JDBCConnectionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;	
import org.springframework.web.servlet.NoHandlerFoundException;

import com.nttdata.id.briinterface.dtos.ApiResponse;
import com.nttdata.id.briinterface.service.LogErrorService;

@ControllerAdvice
public class GlobalExceptionUtils {

	@Autowired
    private LogErrorService logErrorService;
	
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionUtils.class);
	
	@Value("${spring.application.name}")
    private String applicationName;

    @ExceptionHandler(JDBCConnectionException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResponseEntity<ApiResponse<String>> handleJDBCConnectionException(JDBCConnectionException ex, HttpServletResponse res) {
        String correlationId = res.getHeader("Correlation-Id");
        logger.error("Exception caught: {}", ex.getMessage());

        logErrorService.saveLogError(
                correlationId,
                applicationName,
                ExceptionUtils.getClassNameOfException(ex),
                ex.getMessage()
        );

        ApiResponse<String> apiResponse = new ApiResponse<>(
            HttpStatus.SERVICE_UNAVAILABLE.value(),
            "Database Connection Timeout",
            ex.getMessage(),
            null
        );

        return new ResponseEntity<>(apiResponse, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(SQLException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ApiResponse<String>> handleSQLException(SQLException ex, HttpServletResponse res) {
        String correlationId = res.getHeader("Correlation-Id");
        logger.error("Exception caught: {}", ex.getMessage());

        logErrorService.saveLogError(
                correlationId,
                applicationName,
                ExceptionUtils.getClassNameOfException(ex),
                ex.getMessage()
        );

        ApiResponse<String> apiResponse = new ApiResponse<>(
            HttpStatus.SERVICE_UNAVAILABLE.value(),
                "Database Connection Timeout",
                ex.getMessage(),
                null
        );

        return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MQTimeoutException.class)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public ResponseEntity<ApiResponse<String>> timeoutGatewayMQ(Exception ex, HttpServletResponse res) {
        String correlationId = res.getHeader("Correlation-Id");
        logger.error("Exception caught: {}", ex.getMessage());

        logErrorService.saveLogError(
                correlationId,
                applicationName,
                ExceptionUtils.getClassNameOfException(ex),
                ex.getMessage()
        );

        ApiResponse<String> apiResponse = new ApiResponse<>(
            HttpStatus.SERVICE_UNAVAILABLE.value(),
                "MQ Timeout",
                ex.getMessage(),
                null
        );

        return new ResponseEntity<>(apiResponse, HttpStatus.SERVICE_UNAVAILABLE);
    }

    @ExceptionHandler(TimeoutException.class)
    @ResponseStatus(HttpStatus.REQUEST_TIMEOUT)
    public ResponseEntity<ApiResponse<String>> timeoutGateway(Exception ex, HttpServletResponse res) {
        String correlationId = res.getHeader("Correlation-Id");
        logger.error("Exception caught: {}", ex.getMessage());

        logErrorService.saveLogError(
            correlationId,
            applicationName,
            ExceptionUtils.getClassNameOfException(ex),
            ex.getMessage()
        );

        ApiResponse<String> apiResponse = new ApiResponse<>(
            HttpStatus.REQUEST_TIMEOUT.value(),
            "Gateway Timeout",
            ex.getMessage(),
            null
        );

        return new ResponseEntity<>(apiResponse, HttpStatus.REQUEST_TIMEOUT);
    }

    @ExceptionHandler(DataAccessResourceFailureException.class)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public ResponseEntity<ApiResponse<String>> handleDataAccessResourceFailureException(DataAccessResourceFailureException ex, HttpServletResponse res) {
        String correlationId = res.getHeader("Correlation-Id");
        logger.error("Exception caught: {}", ex.getMessage());

        logErrorService.saveLogError(
            correlationId,
            applicationName,
            ExceptionUtils.getClassNameOfException(ex),
            ex.getMessage()
        );

        ApiResponse<String> apiResponse = new ApiResponse<>(
            HttpStatus.SERVICE_UNAVAILABLE.value(),
            "Request Timeout",
            ex.getMessage(),
            null
        );

        return new ResponseEntity<>(apiResponse, HttpStatus.SERVICE_UNAVAILABLE);
    }

    @ExceptionHandler(InterruptedException.class)
    @ResponseStatus(HttpStatus.REQUEST_TIMEOUT)
    public ResponseEntity<ApiResponse<String>> handleInterruptedException(InterruptedException ex, HttpServletResponse res) {
        String correlationId = res.getHeader("Correlation-Id");
        logger.error("Exception caught: {}", ex);

        logErrorService.saveLogError(
                correlationId,
                applicationName,
                ExceptionUtils.getClassNameOfException(ex),
                ex.getMessage()
        );

        ApiResponse<String> apiResponse = new ApiResponse<>(
            HttpStatus.REQUEST_TIMEOUT.value(),
                "Request Timeout",
                ex.getMessage(),
                null
        );

        return new ResponseEntity<>(apiResponse, HttpStatus.REQUEST_TIMEOUT);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ApiResponse<String>> handleAllExceptions(Exception ex, HttpServletResponse res) {
    	String correlationId = res.getHeader("Correlation-Id");
    	logger.error("Exception caught: {}", ex);
    	
        logErrorService.saveLogError(
            correlationId, 
            applicationName, 
            ExceptionUtils.getClassNameOfException(ex),
            ex.getMessage() 
        );
        
        ApiResponse<String> apiResponse = new ApiResponse<>(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Internal Server Error",                   
                ex.getMessage(),
                null
            );

        return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ApiResponse<String>> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpServletResponse res) {
    	String correlationId = res.getHeader("Correlation-Id");
    	logger.error("Exception caught: {}", ex);
    	
        logErrorService.saveLogError(
        		correlationId, 
        		applicationName, 
        		ExceptionUtils.getClassNameOfException(ex),
                ex.getMessage() 
        );
        
        ApiResponse<String> apiResponse = new ApiResponse<>(
                HttpStatus.BAD_REQUEST.value(),
                "Bad Request",           
                ex.getMessage(),
                null    
            );

        return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(DataAccessException.class) // Ganti dengan pengecualian spesifik jika ada
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ApiResponse<String>> handleDatabaseConnectionTimeout(DataAccessException ex, HttpServletResponse res) {
        String correlationId = res.getHeader("Correlation-Id");
        logger.error("Database connection timeout: {}", ex);

        logErrorService.saveLogError(
                correlationId,
                applicationName,
                ExceptionUtils.getClassNameOfException(ex),
                ex.getMessage()
        );

        ApiResponse<String> apiResponse = new ApiResponse<>(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Database Connection Timeout",
                ex.getMessage(),
                null
        );

        return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ApiResponse<String>> handleNoFoundException(NoHandlerFoundException ex, HttpServletResponse res) {
        String correlationId = res.getHeader("Correlation-Id");
        logger.error("Resource Not Found: {}", ex);

        logErrorService.saveLogError(
                correlationId,
                applicationName,
                ExceptionUtils.getClassNameOfException(ex),
                ex.getMessage()
        );

        ApiResponse<String> apiResponse = new ApiResponse<>(
                HttpStatus.NOT_FOUND.value(),
                "Resource Not Found",
                ex.getMessage (),
                null
        );

        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }

}
