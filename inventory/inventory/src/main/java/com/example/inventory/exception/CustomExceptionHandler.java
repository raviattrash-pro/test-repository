package com.example.inventory.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(ProductIdNotFound.class)
	public final ResponseEntity<Object> handleProductNotFoundException(Exception ex, WebRequest request){
		ExceptionFormat exceptionFormat = new ExceptionFormat(ex.getMessage(),new Date(),request.getDescription(false));
		
		return new ResponseEntity(exceptionFormat, HttpStatus.NOT_FOUND) ;
		
		
	}
	
}
