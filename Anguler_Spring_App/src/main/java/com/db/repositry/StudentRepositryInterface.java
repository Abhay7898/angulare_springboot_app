package com.db.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.Model.Student;

public interface StudentRepositryInterface extends JpaRepository<Student,Integer> {

}
