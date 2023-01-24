package utils;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class HibernateUtils {
	
	private static SessionFactory factory;
	static 
	{
		System.out.println("In static init block");
		//build singleton, immutable, third safe SessionFactory
		factory=new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory getFactory() {
		return factory;
	}
}
