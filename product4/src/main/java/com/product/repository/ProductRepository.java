package com.product.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.product.model.Product;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Integer> {

}
