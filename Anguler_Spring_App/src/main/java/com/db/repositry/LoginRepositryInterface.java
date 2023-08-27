package com.db.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.Model.Login;

public interface LoginRepositryInterface extends JpaRepository<Login ,Integer> {

}
