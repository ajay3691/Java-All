package com.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Dao.beansimplement;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	beansimplement ba;

	@Override
	public void run(String... args) throws Exception {
		ba.insertRecords();
		List<?> list = ba.selectData();
		list.forEach(map-> System.out.println(map));
	}

}