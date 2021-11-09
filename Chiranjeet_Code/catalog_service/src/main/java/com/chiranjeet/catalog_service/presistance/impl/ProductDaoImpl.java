package com.chiranjeet.catalog_service.presistance.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chiranjeet.catalog_service.bean.Product;
import com.chiranjeet.catalog_service.bean.ProductList;
import com.chiranjeet.catalog_service.presistance.ProductDao;
import com.chiranjeet.catalog_service.utility.ProductRowMapper;

@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean createProduct(Product pro) throws SQLException, ClassNotFoundException {
		String sql_stmt = "insert into product(id,code,name,description,price) values(?,?,?,?,?)";
		
		int result = jdbcTemplate.update(sql_stmt,pro.getId(),pro.getCode(),pro.getName(),pro.getDescription(),pro.getPrice());

		if(result > 0)
			return true;
		return false;
	}

	@Override
	public boolean deleteProduct(int id) throws SQLException, ClassNotFoundException {
		String sql_stmt = "delete from product where id=?";
		int result = jdbcTemplate.update(sql_stmt,id);
		
		if(result > 0)
			return true;
		return false;
	}

	@Override
	public boolean updateProduct(Product pro) throws SQLException, ClassNotFoundException {
		return false;
	}

	@Override
	public Optional<Product> findProduct(String code) throws SQLException, ClassNotFoundException {
		String sql_stmt = "SELECT * FROM Product where code = '"+code+"'";
		System.out.println(sql_stmt);
		Product product = null;
		try {
			product = jdbcTemplate.queryForObject(sql_stmt,new ProductRowMapper());
		}catch(DataAccessException e) {}
		
		return Optional.ofNullable(product);
	}

	@Override
	public ProductList findProduct() throws ClassNotFoundException, SQLException {
		String sql_stmt = "SELECT * FROM Product";
		List<Product> product_list = jdbcTemplate.query(sql_stmt,new ProductRowMapper());
		return new ProductList(product_list);
	}

	@Override
	public Optional<Product> findProduct(Long product_id) throws ClassNotFoundException, SQLException {
		String sql_stmt = "SELECT * FROM Product where id = ?";
		System.out.println(sql_stmt);
		Product product = null;
		try {
			product = jdbcTemplate.queryForObject(sql_stmt,new ProductRowMapper(),product_id);
		}catch(DataAccessException e) {}
		
		return Optional.ofNullable(product);
	}

}
