package com.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "name")
public class FirstName {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private Lastname lastname;
	public FirstName() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FirstName [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Lastname getLastname() {
		return lastname;
	}
	public void setLastname(Lastname lastname) {
		this.lastname = lastname;
	}
	public FirstName(int id, String firstname, Lastname lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

}
