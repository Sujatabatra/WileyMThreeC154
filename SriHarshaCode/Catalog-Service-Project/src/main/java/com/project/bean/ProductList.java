package com.project.bean;

import java.util.List;

public class ProductList {

	List<Product> products;
	public ProductList() {
		
	}
	public ProductList(List<Product> products) {
		super();
		this.products = products;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
