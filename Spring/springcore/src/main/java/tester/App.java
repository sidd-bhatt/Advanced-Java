package tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Student;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); //context is actually Spring Container
		Student student=(Student) context.getBean("student");//Requesting spring container to get the 'student' bean
		System.out.println(student);//values of object are extracted from xml file.
	}

}
