package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.Nullable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "emp_tbl")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity{
	@Column(name = "first_name",length = 30)
	private String firstName;
	@Column(name = "last_name",length = 30)
	private String lastName;
	@Column(length = 30,unique = true)
	private String email;
	@Column(length = 30,nullable = false)
	private String password;
	@Column(length = 30)
	private String location;
	private LocalDate joinDate;
	private Double salary;
	
}
