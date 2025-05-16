package com.karan.app;

import com.karan.app.model.Alien;
import com.karan.app.model.Laptop;
import com.karan.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemo2Application.class, args);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

		/*Alien alien = context.getBean(Alien.class);
		System.out.println(alien.getAge());
		alien.code();*/
	}

}
