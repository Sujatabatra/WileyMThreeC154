package com.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Product;
import com.project.bean.ProductList;
import com.project.exception.ExceptionStatus;
import com.project.exception.NoDataException;
import com.project.service.ProductService;

@RestController
public class ProductResources {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(path = "/products",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getAllProducts() {
		try {
			ProductList product= productService.getAllProducts();
			return new ResponseEntity<>(product, HttpStatus.OK);
		
		}catch(NoDataException e) {
			ExceptionStatus status = new ExceptionStatus(e.getMessage());
			return new ResponseEntity<>(status,HttpStatus.NO_CONTENT);
		}
		
	}
	
	
	@GetMapping(path = "/products/code/{pid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getProductByCode(@PathVariable("pid") String code) {
		try {
			Product product= productService.getProductByCode(code);
			return new ResponseEntity<>(product, HttpStatus.OK);
		
		}catch(NoDataException e) {
			ExceptionStatus status = new ExceptionStatus(e.getMessage());
			return new ResponseEntity<>(status,HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping(path = "/products/{pid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getProductById(@PathVariable("pid") long pid) {
		try {
			Product product= productService.getProductById(pid);
			return new ResponseEntity<>(product, HttpStatus.OK);
		
		}catch(NoDataException e) {
			ExceptionStatus status = new ExceptionStatus(e.getMessage());
			return new ResponseEntity<>(status,HttpStatus.NOT_FOUND);
		}
		
	}
	 
	

}
