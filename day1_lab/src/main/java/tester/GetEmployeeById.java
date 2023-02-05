package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.EmployeeDaoImpl;
import pojo.Employee;
import utils.Department;

public class GetEmployeeById {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			EmployeeDaoImpl userDao = new EmployeeDaoImpl();
			System.out.println("Enter Department and Enter user id");
			System.out.println(userDao.getEmpByDept(Department.valueOf(sc.next()), sc.nextInt()));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}