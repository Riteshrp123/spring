package com.xworkz.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {
	
	@Autowired
	private Cat cat;
	@Autowired
	private Dog dog;
	
	public void eat() {
		System.out.println("eating...");
		
		cat.meow();
		dog.bark();
	}
	
	

}
