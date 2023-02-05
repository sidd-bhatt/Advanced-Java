package tester;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Session;

public class OneToOne {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().buildSessionFactory();
	}

}
