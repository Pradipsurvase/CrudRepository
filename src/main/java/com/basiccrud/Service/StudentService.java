//Third Implementation

package com.basiccrud.Service;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.basiccrud.Dao.Dao;
import com.basiccrud.Entity.Student;

import lombok.Data;

@Service
public class StudentService {
	// Save DaoLayer

	@Autowired
	private Dao dao;

	public String Addstudent(Student student) {
		dao.save(student);
		return "new student has been added in database ,Roll no is" + student.getId();
	}
	public String Addstudent(List<Student> student) {
		dao.saveAll(student);
		return "All new student has been added in database";
	}
	public String Deletestudent(int Id) {
		Student student=dao.getById(Id);
		dao.delete(student);
		return "new student has been added in database ,Roll no is"+Id;
	}
	public String Updatestudent(Student student) {
		dao.save(student);
		return "new student has been added in database ,Roll no is"+student.getId();
	}
	public String Updatestudent(int Id) {
		Student student=dao.getById(Id);
		dao.save(student);
		return "new student has been added in database ,Roll no is"+student.getId();
	}
	public String Getstudent(int Id) {
		Student student=dao.getById(Id);
		dao.save(student);
		return "new student"+student.getId();
	}

}
