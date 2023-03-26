package com.springbootannotations.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springbootannotations.AppError;
import com.springbootannotations.exception.AnnotationnsNotFoundException;
import java.util.UUID;

@RestControllerAdvice
public class AnnotationExceptionHandler {

	@ExceptionHandler(AnnotationnsNotFoundException.class)
	public ResponseEntity<AppError> handleException(AnnotationnsNotFoundException exception) {
		AppError error = new AppError(UUID.randomUUID().toString(), exception.getMessage(),
				HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}