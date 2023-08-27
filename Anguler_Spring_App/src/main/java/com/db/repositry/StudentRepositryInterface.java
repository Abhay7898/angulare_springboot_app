package com.db.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.model.Student;

public interface StudentRepositryInterface extends JpaRepository<Student,Integer> {
	
	List<Student> findByFirstNameAndMobileNumber(String name,long mobileNumber);

}
