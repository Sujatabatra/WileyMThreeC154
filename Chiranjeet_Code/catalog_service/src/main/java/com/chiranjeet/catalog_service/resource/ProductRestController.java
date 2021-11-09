package com.chiranjeet.catalog_service.resource;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.chiranjeet.catalog_service.bean.Product;
import com.chiranjeet.catalog_service.bean.ProductList;
import com.chiranjeet.catalog_service.service.ProductService;
import com.chiranjeet.catalog_service.utility.ProductNotFound;

@RestController
public class ProductRestController {
	@Autowired
	private ProductService productService;
	
	@GetMapping(path = "/products",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductList> listAllProducts() throws ClassNotFoundException, SQLException {
		ProductList pro_list = productService.findProduct();
		if(pro_list == null)
			throw new ProductNotFound("No Product Available");
		
		return new ResponseEntity<ProductList>(productService.findProduct(), HttpStatus.FOUND);
	}
	
	@GetMapping(path ="/products/code/{productCode}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getProductByCode(@PathVariable String productCode) throws ClassNotFoundException, SQLException {
		Optional<Product> op = productService.findProduct(productCode);
		if(op.isEmpty()) {
			throw new ProductNotFound(productCode);
		}
		return new ResponseEntity<Product>(op.get(), HttpStatus.FOUND);
	}
	
	@GetMapping(path ="/products/id/{productId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getProductByCode(@PathVariable Long productId) throws ClassNotFoundException, SQLException {
		Optional<Product> op = productService.findProduct(productId);
		if(op.isEmpty()) {
			throw new ProductNotFound(""+productId);
		}
		return new ResponseEntity<Product>(op.get(), HttpStatus.FOUND);
	}
}
