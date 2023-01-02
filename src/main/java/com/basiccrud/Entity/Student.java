//First Implementation

package com.basiccrud.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
@Entity
public class Student {

	// Save Service Layer

	@Id
	@Column
	@GeneratedValue
	@Getter
	@Setter
	int id;
	@Column
	@Getter
	@Setter
	String Fname;
	@Column
	@Getter
	@Setter
	String Lname;
	
//	@OneToOne
//	Teachers teacher;
	public Student() {
		super();

	}

	public Student(int id, String fname, String lname) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
	}

	
	
}
