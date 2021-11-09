package com.chiranjeet.catalog_service.utility;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.chiranjeet.catalog_service.bean.Product;


public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Long id = resultSet.getLong("id");
		String code = resultSet.getString("code");
		String name = resultSet.getString("name");
		String description = resultSet.getString("description");
		double price = resultSet.getDouble("price");
		
		Product product = new Product(id, code, name, description, price);
		return product;
	}
}
