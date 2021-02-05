package com.techproed.restapi01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB03HelloWorldBeanController {

	//FirstWay:
	@RequestMapping(method = RequestMethod.GET, path="/hwbean1")

	public SB02HelloWorldBean helloWorldBean1() {

		return new SB02HelloWorldBean("Hellow World", 1);

	}


	//2nd Way

	@GetMapping(path="/hwbean2")

	public SB02HelloWorldBean helloWorldBean2() {

		return new SB02HelloWorldBean("Hellow World Bean 2", 2);

	}


}
