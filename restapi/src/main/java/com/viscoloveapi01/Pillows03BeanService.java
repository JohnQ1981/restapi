package com.viscoloveapi01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Pillows03BeanService {

	public final Pillows02BeanRepository pillowsRepository ;
	@Autowired
	public Pillows03BeanService(Pillows02BeanRepository pillowsRepository) {

		this.pillowsRepository=pillowsRepository;

	}
	public List<Pillows01Bean> getPillowsList(){

		return pillowsRepository.findAll();

	}


}
