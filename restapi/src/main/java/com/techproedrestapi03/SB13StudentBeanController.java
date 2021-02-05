package com.techproedrestapi03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class SB13StudentBeanController {

	private final SB12StudentBeanService studentService;

	@Autowired
	public  SB13StudentBeanController(SB12StudentBeanService studentService) {


		this.studentService=studentService;

	}
	@GetMapping(path="/alls")
	public List<SB10StudentBean> getAllStudent(){

		return studentService.getStudentList();



	}

}
