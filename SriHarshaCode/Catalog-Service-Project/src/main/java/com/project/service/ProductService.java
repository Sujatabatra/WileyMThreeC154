package com.project.service;

import com.project.bean.Product;
import com.project.bean.ProductList;
import com.project.exception.NoDataException;

public interface ProductService {

	ProductList getAllProducts()  throws NoDataException ;

	Product getProductById(long pid)throws NoDataException;

	Product getProductByCode(String code)throws NoDataException;
}
