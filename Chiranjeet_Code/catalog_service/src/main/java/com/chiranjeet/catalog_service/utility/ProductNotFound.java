package com.chiranjeet.catalog_service.utility;


public class ProductNotFound extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductNotFound(String id) {
	    super("Could not find Product " + id);
	  }
}