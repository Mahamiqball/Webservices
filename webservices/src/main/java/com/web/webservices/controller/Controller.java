package com.web.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.webservices.product;
import com.web.webservices.service.ServiceLyr;

@RestController
public class Controller {

	@Autowired
	private ServiceLyr servicelayer;
	
	@GetMapping("/products")
	public List<product> getProducts(){
		return this.servicelayer.getProducts();
	}
	
	@GetMapping("/products/{productId}")
	public product getProduct(@PathVariable String productId) {
		return this.servicelayer.getProduct(Long.parseLong(productId));
	}
	
	@PostMapping("/products")
	public product addProduct(@RequestBody product productt) {
		return this.servicelayer.addProduct(productt);
	}
	
	
	@PutMapping("/products")
	public product updateProduct(@RequestBody product Product) {
		return this.servicelayer.updateProduct(Product);
	}
	
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String productId){
		try {
			this.servicelayer.deleteProduct(Long.parseLong(productId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/products")
	public List<product> dltProducts(){
		return this.servicelayer.dltProducts();
	}
	
	
	
}
