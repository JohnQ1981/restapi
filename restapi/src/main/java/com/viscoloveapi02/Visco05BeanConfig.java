package com.viscoloveapi02;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Visco05BeanConfig {
	@Bean
	CommandLineRunner commandLineVisco(Visco02BeanRepository viscoLoveRepo) {
		return arg->{

			Visco01Bean v1= new Visco01Bean(1001, "Red-Sajjada", 69.99);
			Visco01Bean v2= new Visco01Bean(1002, "Blue-Sajjada", 69.99);
			Visco01Bean v3= new Visco01Bean(1003, "Green-Sajjada", 69.99);
			Visco01Bean v4= new Visco01Bean(1004, "Purple-Sajjada", 69.99);
			Visco01Bean v5= new Visco01Bean(1005, "Brown-Sajjada", 69.99);
			Visco01Bean v6= new Visco01Bean(1006, "Black-Sajjada", 69.99);
			Visco01Bean v7= new Visco01Bean(1007, "Cream-Sajjada", 69.99);

			viscoLoveRepo.saveAll(List.of(v1,v2,v3,v4,v5,v6,v7));

		};


	}

}
