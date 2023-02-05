package com.mapping;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Lastname {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private String lastname;
	@Override
	public String toString() {
		return "Lastname [id=" + id + ", lastname=" + lastname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Lastname() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lastname(int id, String lastname) {
		super();
		this.id = id;
		this.lastname = lastname;
	}

}
