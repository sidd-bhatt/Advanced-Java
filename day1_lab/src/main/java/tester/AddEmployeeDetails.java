package tester;


import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import pojo.Employee;
import utils.Department;

public class AddEmployeeDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			EmployeeDao empDao=new EmployeeDaoImpl();
			System.out.println(
					"Enter user details :  firstName,  lastName,  role, regAmount, regDate(yr-mon-day), Permanant? ");
			Employee employee=new Employee(sc.next(), sc.next(), Department.valueOf(sc.next()), sc.nextDouble(), LocalDate.parse(sc.next()), sc.nextBoolean());
			//invoke dao's method
			System.out.println(empDao.addEmpDetails(employee));
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
