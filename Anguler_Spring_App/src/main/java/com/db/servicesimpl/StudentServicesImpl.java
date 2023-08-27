package com.db.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.Model.Student;
import com.db.repositry.StudentRepositryInterface;
import com.db.services.StudentServices;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentServicesImpl implements StudentServices{
	
	@Autowired
	public StudentRepositryInterface stuRepositry;

	@Override
	public Student createStudent(Student student) {
		Student stu =stuRepositry.save(student);
		log.info(student.toString());
		return stu;
	}

	@Override
	public Student upadteStudent(Student student) {
		
		return null;
	}

	@Override
	public Student getAllStudent(Student student) {
		
		return null;
	}

	@Override
	public Student deleteStudentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByNameAndMobileNumber(String name, long mobilenumber) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
