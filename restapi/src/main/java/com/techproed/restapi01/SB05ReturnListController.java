package com.techproed.restapi01;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB05ReturnListController {

	@GetMapping(path="/list")
	public List<String> stringList(){

		return List.of("Ali","Veli","Ocean","Mary");
	}


	@GetMapping(path="/stbean")
	public List<SB06StudentBean> objectList(){



		return List.of(
				new SB06StudentBean("Ali Can", 101, "male"),
				new SB06StudentBean("Veli Han", 102, "male"),
				new SB06StudentBean("Mary Star", 103, "female")


				);
	}








}
