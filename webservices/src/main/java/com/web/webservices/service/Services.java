package com.web.webservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.web.webservices.product;

@Service
public class Services implements ServiceLyr {

	List<product> list;
	
	
	public Services() {
		list = new ArrayList<>();
		list.add(new product(01,"Samsung","Samsung brand, and is the largest South Korean chaebol (business conglomerate)"));
		list.add(new product(02,"Huawei"," Huawei phones should continue to receive application and security updates in the short term"));
		
		
	}


	@Override
	public List<product> getProducts() {
		
		return list;
	}


	@Override
	public product getProduct(long productId) {
		product p = null;
		
		for (product product:list) {
			if(product.getId()==productId) {
				p= product;
				break;
			}
		}
		return p;
	}


	@Override
	public product addProduct(product productt){
		list.add(productt);
		return productt;
	}


	@Override
	public product updateProduct(product Product) {
		list.forEach(e-> {
			if(e.getId()==Product.getId()) {
				e.setProName(Product.getProName());
				e.setProDescrip(Product.getProDescrip());
			}
		});
		return Product;
	}
	
	
	@Override
	public void deleteProduct(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}


	@Override
	public List<product> dltProducts() {
		list.clear();
		return list;
	}


	


	


	
		
	}


	


	
	
	


	





