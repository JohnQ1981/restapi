package com.techproed.restapi05;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SB22StudentBeeanService {

	public static SB21StudentBeanRepository studentRepo;

	@Autowired
	public SB22StudentBeeanService (SB21StudentBeanRepository studentRepo) {
		this.studentRepo= studentRepo;

	}
	//For GET Request
	public static List<SB20StudentBean> getStudents(){
		return studentRepo.findAll();

	}
	//For Post Request
	public static void addNewStudent(SB20StudentBean studentBean) {
		Optional<SB20StudentBean>studentEmailOptional=studentRepo.findSB20StudentBeanByEmail(studentBean.getEmail());

		if(studentEmailOptional.isPresent()) {
			throw new IllegalStateException("Email is already in use, use other email");

		}

		Optional<SB20StudentBean>studentIdlOptional=studentRepo.findSB20StudentBeanById(studentBean.getId());
		if(studentIdlOptional.isPresent()) {
			throw new IllegalStateException("ID already in use, id must be unique...");

		}
		studentRepo.save(studentBean);
	}


	//For Delete Request

	public static String deleteStudentById(Long studentId) {
		//1.Way to check if the record exist by using id
		boolean isExist=studentRepo.existsById(studentId);

		if(!isExist) {
			throw new IllegalStateException(studentId+" does not exist...No data deleted");

		}
		studentRepo.deleteById(studentId);

		return "Student with id: " +studentId+ " is deleted successfully";
	}



	//Put Request
	@Transactional
	public static SB20StudentBean updateStudent(Long studentId,@RequestBody SB20StudentBean newStudent) {

		//2.nd Way to check if the record exist by using id
		SB20StudentBean existingStudent= studentRepo.findById(studentId).orElseThrow(()->new IllegalStateException(studentId+" does not exits..."));

		//Update Email
		String newName=newStudent.getName();
		if(!newName.equals(existingStudent.getName())) {
			existingStudent.setName(newName);
		}
		//Update email
		String newEmail=newStudent.getEmail();
		if(!newEmail.equals(existingStudent.getEmail())) {
			existingStudent.setEmail(newEmail);

		}
		//Update DOB
		LocalDate newDob=newStudent.getDob();
		if(!newDob.equals(existingStudent.getDob())) {
			existingStudent.setDob(newDob);;

		}

		return studentRepo.save(existingStudent);












	}





}
