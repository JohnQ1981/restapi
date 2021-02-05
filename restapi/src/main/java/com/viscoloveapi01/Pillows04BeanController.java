package com.viscoloveapi01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Pillows04BeanController {

	public final Pillows03BeanService pillowService;

	@Autowired
	public Pillows04BeanController (Pillows03BeanService pillowService) {
		this.pillowService=pillowService;

	}
	@GetMapping(path="/pillows")
	public List<Pillows01Bean> getAllPillows(){
		return pillowService.getPillowsList();
	}
}
