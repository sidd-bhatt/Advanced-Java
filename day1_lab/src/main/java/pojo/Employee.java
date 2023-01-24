package pojo;

import java.time.LocalDate;
import javax.persistence.*;
import utils.Department;

@Entity
@Table(name="emps",uniqueConstraints = @UniqueConstraint(columnNames = {"first_name","last_name"}))
public class Employee {
	
	@Id//Primary Key constraints to id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//=>auto_incremented id by hibernate
	@Column(name="emp_id")
	private Long id;
	@Column(name="first_name", length=30)
	private String firstname;
	@Column(name="last_name", length=30)
	private String lastname;
	
	@Enumerated(EnumType.STRING)//the column type is going to be varChar and its 
	//going to be in string form
	private Department dept;
	private double salary;
	private LocalDate dob;
	private boolean isPermanent;
	
	
	public Employee()
	{
		
	}
	
	public Employee(Long id, String firstname, String lastname, Department dept, double salary, LocalDate dob,
			boolean isPermanent) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dept = dept;
		this.salary = salary;
		this.dob = dob;
		this.isPermanent = isPermanent;
	}
	
	


}
