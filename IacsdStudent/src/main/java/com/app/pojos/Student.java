package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="student_tbl")
public class Student extends BaseEntity
{


	private String firstname;
	private String lastame;
	private String email;
	@Column(nullable = false)
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	private String class_std;
	private String location;
	private LocalDate admissiondate;
	private double scholarship;
	public Student(String firstname, String lastame, String email, String password, String class_std, String location,
			LocalDate admissiondate, double scholarship) {
		super();
		this.firstname = firstname;
		this.lastame = lastame;
		this.email = email;
		this.password = password;
		this.class_std = class_std;
		this.location = location;
		this.admissiondate = admissiondate;
		this.scholarship = scholarship;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastame() {
		return lastame;
	}

	public void setLastame(String lastame) {
		this.lastame = lastame;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClass_std() {
		return class_std;
	}

	public void setClass_std(String class_std) {
		this.class_std = class_std;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getAdmissiondate() {
		return admissiondate;
	}

	public void setAdmissiondate(LocalDate admissiondate) {
		this.admissiondate = admissiondate;
	}

	public double getScholarship() {
		return scholarship;
	}

	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}

	@Override
	public String toString() {
		return "Student [ID : "+getId()+", firstname=" + firstname + ", lastame=" + lastame + ", email=" + email + ", password="
				+ password + ", class_std=" + class_std + ", location=" + location + ", admissiondate=" + admissiondate
				+ ", scholarship=" + scholarship + "]";
	}
	
	
	
	
	
	
	
	
}
