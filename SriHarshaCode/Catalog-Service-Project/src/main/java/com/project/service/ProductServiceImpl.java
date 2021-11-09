package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Product;
import com.project.bean.ProductList;
import com.project.exception.NoDataException;
import com.project.persistence.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	@Override
	public ProductList getAllProducts() throws NoDataException {
		ProductList products = productDao.getAllProducts();
		if(products==null)
			throw new NoDataException("Data Not Found");
		return products;
	}
	@Override
	public Product getProductById(long code) throws NoDataException {
		Product product = productDao.getProductById(code);
		if(product==null)
			throw new NoDataException("Product Not Found");
		return product;
	}
	@Override
	public Product getProductByCode(String code) throws NoDataException {
		Product product = productDao.getProductByCode(code);
		if(product==null)
			throw new NoDataException("Data Not Found");
		return product;
	}

}
