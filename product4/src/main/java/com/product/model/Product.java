package com.product.model;

import org.springframework.stereotype.Component;

@Component
public class Product {

	//private int id;
	private Integer id;
	private String name;
	private double price;
	private Integer qty;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
