package com.xworkz.ornaments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.ornaments.config.OrnamentsConfig;
import com.xworkz.ornaments.dto.OrnamentsDto;
import com.xworkz.ornaments.service.OrnamentsService;
import com.xworkz.ornaments.service.OrnamentsServiceImpl;

public class OrnamentsRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(OrnamentsConfig.class);
		OrnamentsService service = context.getBean(OrnamentsServiceImpl.class);

		OrnamentsDto dto = new OrnamentsDto("Neklesh", "50000rs", "200gm", "neck", "20k", "gold");
		OrnamentsDto dto1 = new OrnamentsDto("Ring", "40000rs", "100m", "finger", "18k", "silver");
		OrnamentsDto dto2 = new OrnamentsDto("Bracelet", "30000rs", "150gm", "Hand", "18k", "silver");
		OrnamentsDto dto3 = new OrnamentsDto("Peercing", "20000rs", "140gm", "Nose", "24k", "Titanium");
		OrnamentsDto dto4 = new OrnamentsDto("Toe ring", "40000rs", "100gm", "Toe", "19k", "Metal");
		OrnamentsDto dto5 = new OrnamentsDto("Earring", "10000rs", "50gm", "ear", "18k", "Gold");

		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		service.save(dto5);

		for (OrnamentsDto dtos : service.read()) {
			System.out.println(dto);

			System.out.println(service.findNameByType("Bracelet", "Hand"));
			System.out.println(service.updateNameById("Nosering", 5));
			System.out.println(service.deleteById(2));
		}
	}
}
