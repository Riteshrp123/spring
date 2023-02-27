package com.xworkz.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalRunner {

	public static void main(String[] args) {
		
	   ApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);
		
       Animal animal = context.getBean(Animal.class); 
       animal.eat();
	}

}
