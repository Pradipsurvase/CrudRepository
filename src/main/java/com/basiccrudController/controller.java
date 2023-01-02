//Second Implementation

package com.basiccrudController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basiccrud.Entity.Student;
import com.basiccrud.Service.StudentService;

@RestController
//@RequestMapping
public class controller {

	@Autowired
	private StudentService studentservice;

	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		return studentservice.Addstudent(student);
	}

	@PutMapping("/bulkAdd")
	public String AddStudent(@RequestBody List<Student> student) {
		return studentservice.Addstudent(student);
	}

	@PutMapping("/add")
	public String UpdateStudent(@RequestBody Student student) {
		return studentservice.Addstudent(student);
	}

	@DeleteMapping("/all/{Id}")
	public String deleteStudent(@PathVariable int Id) {
		return studentservice.Deletestudent(Id);
	}

	@RequestMapping("/all/{Id}")
	public String getStudent(@PathVariable int Id) {
		return studentservice.Getstudent(Id);
	}

}
