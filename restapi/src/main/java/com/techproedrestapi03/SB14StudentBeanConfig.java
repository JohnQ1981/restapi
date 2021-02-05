package com.techproedrestapi03;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SB14StudentBeanConfig {
	@Bean
	CommandLineRunner commanLineRunner1(SB11StudentBeanRepository studentRepository) {

		return arg->{
			SB10StudentBean aliCan= new SB10StudentBean(101L, "Ali Can", "ac@gmail.com", LocalDate.of(2002,Month.APRIL,19), 19);
			SB10StudentBean veliHan=new SB10StudentBean(102L, "Veli Han", "vh@gmail.com", LocalDate.of(2002,Month.AUGUST,19), 19);
			SB10StudentBean deliCan=new SB10StudentBean(103L, "Deli Can", "dc@gmail.com", LocalDate.of(2002,Month.APRIL,19), 19);

			studentRepository.saveAll(List.of(aliCan,veliHan, deliCan));
		};

	}

}
