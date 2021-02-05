package com.viscoloveapi02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Visco03BeanService {

	public final Visco02BeanRepository viscoLoveRepo;
	@Autowired
	public Visco03BeanService (Visco02BeanRepository viscoLoveRepo) {
		this.viscoLoveRepo=viscoLoveRepo;

	}

	public List<Visco01Bean> getViscoList(){

		return viscoLoveRepo.findAll();		

	}
}
