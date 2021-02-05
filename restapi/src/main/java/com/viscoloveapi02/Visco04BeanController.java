package com.viscoloveapi02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Visco04BeanController {
	public final Visco03BeanService viscoService;
	@Autowired
	public Visco04BeanController(Visco03BeanService viscoService) {

		this.viscoService=viscoService;

	}
	@GetMapping(path="/visco")
	public List<Visco01Bean> getViscoAll(){

		return viscoService.getViscoList();

	}
}
