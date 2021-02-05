package com.techproed.restapi01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB04HelloWorldWithParametherController {

	@GetMapping(path="/param/{name}")
	public SB02HelloWorldBean helloWorldBeanParam(@PathVariable String name) {

		return new SB02HelloWorldBean(String.format("Hello %s Parameterized ", name), 3);

	}

}
