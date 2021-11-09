package com.chiranjeet.catalog_service.utility;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ControllerAdvice
public class ProductNotFoundAdvice {
	 @ResponseBody
	 @ExceptionHandler(ProductNotFound.class)
	 @ResponseStatus(HttpStatus.NOT_FOUND)
	 String productNotFoundHandler(ProductNotFound ex) {
	    return ex.getMessage();
	  }
	 
	 @ResponseBody
	 @ExceptionHandler(Exception.class)
	 String OtherException() {
	    return "Something went wrong";
	 }
}
