package com.db.services;

import com.db.Model.Student;

public interface StudentServices {
	
	public Student createStudent(Student student);
	public Student upadteStudent(Student student);
	public Student getAllStudent(Student student);
	public Student deleteStudentById(Integer id);
	public Student getStudentByNameAndMobileNumber(String name,long mobilenumber);

}
