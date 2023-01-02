package com.basiccrud.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.basiccrud.Entity.Student;

public interface Dao extends JpaRepository<Student, Integer> {
	
}