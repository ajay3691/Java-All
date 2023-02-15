package com.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.beans.Beans;
@Component
public class Myrunner implements CommandLineRunner {

	@Autowired
	Beans bean;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bean.display();
	}

}
