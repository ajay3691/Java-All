package com.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	ProductRepository productRepo;

	// createProduct
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
	}

	public List<Product> getProducts() {
		return productRepo.findAll();
	}
	public void updaeProduct(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
	}
	

}
