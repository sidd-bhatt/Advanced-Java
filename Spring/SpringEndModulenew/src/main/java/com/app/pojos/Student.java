package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student_tbl")
public class Student extends BaseEntity {
	
	@Column(name = "first_name", length=30)
	private String firstName;
	@Column(name = "last_name", length=30)
	private String lastName;
	@Column(length = 30,unique = true)
	private String email;
	@Column(length = 30,nullable = false)
	private String password;
	@Column(length=30)
	private String branch;
	@Column(length=30, nullable = false)
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Course> courses;
	
	public void addCourse(Course course) {
		courses.add(course);
		course.setStudent(this);
	}

	
	
	
	public Student() {
		super();
	}


	public Student(String firstName, String lastName, String email, String password, String branch,
			List<Course> courses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.branch = branch;
		this.courses = courses;
	}

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", branch=" + branch + "]";
	} 
	
	

}
