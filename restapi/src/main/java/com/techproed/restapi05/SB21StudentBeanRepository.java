package com.techproed.restapi05;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SB21StudentBeanRepository extends JpaRepository<SB20StudentBean, Long> {

	//SELECT * FROM students2021 where email=.....?
	Optional<SB20StudentBean> findSB20StudentBeanByEmail(String email);


	//SELECT * FROM students2021 where id=.....?
	Optional<SB20StudentBean> findSB20StudentBeanById(Long id);


}
