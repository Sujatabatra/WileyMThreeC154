package com.project.persistence;

import com.project.bean.Product;
import com.project.bean.ProductList;

public interface ProductDao {

	ProductList getAllProducts();

	Product getProductById(long id);

	Product getProductByCode(String code);
}
