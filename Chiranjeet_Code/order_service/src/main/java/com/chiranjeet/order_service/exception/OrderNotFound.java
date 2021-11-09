package com.chiranjeet.order_service.exception;

public class OrderNotFound extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderNotFound(String message) {
        super(message);
    }
}
