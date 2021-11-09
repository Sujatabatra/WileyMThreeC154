package com.project.bean;

import java.math.BigDecimal;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class OrderItem {

	@Id
	private long id;
	private long productId;
    private int quantity;
    private BigDecimal productPrice;
   
    public OrderItem() {
    	
    }

	public OrderItem(long id, long productId, int quantity, BigDecimal productPrice) {
		super();
		this.id = id;
		this.productId = productId;
		this.quantity = quantity;
		this.productPrice = productPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
    
}
