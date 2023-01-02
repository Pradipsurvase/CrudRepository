package com.basiccrud.Respository;

import org.springframework.data.repository.CrudRepository;

import com.basiccrud.Entity.Student;

public interface UserRespository extends CrudRepository<Student, Integer>{

}