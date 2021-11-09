package com.chiranjeet.catalog_service.service.impl;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chiranjeet.catalog_service.bean.Product;
import com.chiranjeet.catalog_service.bean.ProductList;
import com.chiranjeet.catalog_service.presistance.ProductDao;
import com.chiranjeet.catalog_service.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productDao;
	
	@Override
	public boolean createProduct(Product pro) throws SQLException, ClassNotFoundException {
		return productDao.createProduct(pro);
	}

	@Override
	public boolean deleteProduct(int id) throws SQLException, ClassNotFoundException {
		return productDao.deleteProduct(id);
	}

	@Override
	public boolean updateProduct(Product pro) throws SQLException, ClassNotFoundException {
		return productDao.updateProduct(pro);
	}

	@Override
	public Optional<Product> findProduct(String code) throws SQLException, ClassNotFoundException {
		return productDao.findProduct(code);
	}
	
	@Override
	public Optional<Product> findProduct(Long product_id) throws SQLException, ClassNotFoundException {
		return productDao.findProduct(product_id);
	}

	@Override
	public ProductList findProduct() throws ClassNotFoundException, SQLException {
		return productDao.findProduct();
	}

}
