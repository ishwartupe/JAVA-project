package com.boot.Project2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DbRunner implements CommandLineRunner {

	@Autowired
	DBConfig dbc;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("From Runner Class");

		System.out.println(dbc.toString());
	}

}
