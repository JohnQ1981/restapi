package com.viscoloveapi01;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Pillows05BeanConfig {
	@Bean
	CommandLineRunner commandLinePillow(Pillows02BeanRepository pillowsRepository) {

		return arg-> {
			//			Pillows01Bean p1=new Pillows01Bean(101, "Travel Mate", "Travel Pillow");
			//			Pillows01Bean p2=new Pillows01Bean(102, "Visco Thera", "Sleep Pillow");
			//			Pillows01Bean p3=new Pillows01Bean(103, "Visco Boomerang", "Sleep Pillow");
			//			Pillows01Bean p4=new Pillows01Bean(104, "Visco Butterfly", "Sleep Pillow");
			Pillows01Bean p5=new Pillows01Bean(105, "Travel Mate", "Travel Pillow");
			Pillows01Bean p6=new Pillows01Bean(106, "Visco Thera", "Sleep Pillow");
			Pillows01Bean p7=new Pillows01Bean(107, "Visco Boomerang", "Sleep Pillow");
			Pillows01Bean p8=new Pillows01Bean(108, "Visco Butterfly", "Sleep Pillow");

			pillowsRepository.saveAll(List.of(p5,p6,p7,p8));

		};
	}

}
