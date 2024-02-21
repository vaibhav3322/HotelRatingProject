package com.java.user.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.java.user.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex,
			WebRequest webRequest) {

		ApiResponse apiResponse = new ApiResponse(new Date(), ex.getMessage(), webRequest.getDescription(false), false);

		return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
	}

//	@ExceptionHandler(ResourceNotFoundException.class)
//	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {
//	String message = ex.getMessage();
//	ApiResponse response = ApiResponse.builder().message(message)
//			.success(true).status(HttpStatus.NOT_FOUND).build();
//
//	return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
//
//}

}
