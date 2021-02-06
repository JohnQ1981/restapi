package com.techproed.restapi05;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB23StudentBeanController {


	@GetMapping(path="/api/v1/students2021")
	public List<SB20StudentBean> getStudentList(){
		return SB22StudentBeeanService.getStudents();

	}

	@PostMapping(path="/api/v1/students2021")
	public void insertNewStudent(@RequestBody SB20StudentBean student) {
		SB22StudentBeeanService.addNewStudent(student);



	}

	@DeleteMapping(path="/api/v1/delete/{studentId}")
	public String deleteStudentById(@PathVariable(value="studentId") Long studentId) {
		return SB22StudentBeeanService.deleteStudentById(studentId);


	}

	@PutMapping(path="/api/v1/update/{studentId}")
	public ResponseEntity<SB20StudentBean> updateStudentById(@PathVariable(value="studentId") Long studentId, @Validated @RequestBody SB20StudentBean newStudent) {

		return ResponseEntity.ok(SB22StudentBeeanService.updateStudent(studentId, newStudent));
	}


}

