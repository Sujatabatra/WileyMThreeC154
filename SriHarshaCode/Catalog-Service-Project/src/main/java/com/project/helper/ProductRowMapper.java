package com.project.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.bean.Product;



public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		long id = rs.getLong("id");
		String name = rs.getString("name");
		String code = rs.getString("code");
		String description = rs.getString("description");
		int price = rs.getInt("price");
		Product product = new Product(id, code, name, description, price);
		return product;
	}

}
