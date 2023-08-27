package com.db.services;

import com.db.Model.Student;

public interface StudentServices {
	
	public Student createStudent(Student stu);
	public Student upadteStudent(Student stu);
	public Student getAllStudent(Student stu);
	public Student deleteStudentById(Integer id);
	public Student getStudentByNameAndMobileNumber(String name,long mobilenumber);

}
