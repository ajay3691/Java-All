package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.product.model.Product;
import com.product.services.ProductServices;

@Repository
public class ProductController {

	@Autowired
	ProductServices productservice;

	@PostMapping("product")
	public void addProduct(@RequestBody Product product) {
		productservice.saveProduct(product);
		// TODO Auto-generated method stub

	}

}
