package com.project.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.bean.Product;
import com.project.bean.ProductList;
import com.project.helper.ProductRowMapper;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public ProductList getAllProducts() {
		String query="SELECT * FROM Products";
		
		List<Product> products=jdbcTemplate.query(query, new ProductRowMapper());
		ProductList productList= new ProductList(products);
		return productList;
	}

	@Override
	public Product getProductById(long id) {
		String query="SELECT * FROM Products where id=?";
		Product product = new Product();
		try {
			product=jdbcTemplate.queryForObject(query, new ProductRowMapper(), id);
			}catch(EmptyResultDataAccessException e) {
				return null;
			}
			return product;
	}

	@Override
	public Product getProductByCode(String code) {
		String query="SELECT * FROM Products where code=?";
		Product product = new Product();
		try {
			product=jdbcTemplate.queryForObject(query, new ProductRowMapper(), code);
			}catch(EmptyResultDataAccessException e) {
				return null;
			}
			return product;
	}

}
