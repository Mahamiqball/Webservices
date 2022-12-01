package com.web.webservices.service;

import java.util.List;

import com.web.webservices.product;

public interface ServiceLyr {
	public List<product> getProducts();

	public product getProduct(long productId);
	
	public product addProduct(product productt);
	
	public product updateProduct(product Product);
	
	public void deleteProduct(long parseLong);
	
	public List<product> dltProducts();
	
	
	
}
