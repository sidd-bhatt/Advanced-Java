package com.app.studentdto;


public class StudentAdd {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String branch;
	public StudentAdd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentAdd(String firstName, String lastName, String email, String password, String branch) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.branch = branch;
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

	

}
