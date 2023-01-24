package dao;
import org.hibernate.*;

import pojo.Employee;

import static utils.HibernateUtils.getFactory;


public class EmployeeDaoImpl implements EmployeeDao {
	
	public String addEmpDetails(Employee newEmp) 
	{
		//Status of newEmp here=TRANSIENT
		String message="Added emp failed";
		//1.Get session from SessionFactory
		Session session=getFactory().getCurrentSession();
		//2.Begin trasaction
		Transaction tx=session.beginTransaction();
		try
		{
			//Session API: public Serializable save(Object TransientObjRef)
			//throws HibernateException
			
			Long id=(Long)session.save(newEmp);
			//Status of newEmp here=PERSISTENT => entity ref. added to L1 cache
			
			tx.commit();//Hibernate is goind to perform Dirty Checking
			//-which in turn will call session.flush() => Insert query will be fired.
			//-Then session.close() is called => L1 cache is destroyed and returns 
			//-DB connection to DBCP
			//Status of newEmp here => DETACHED(from l1 cashe)
			
			message="Added emp details"+id;
		}
		catch (RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			//rethrow the same exception to the caller so that caller will know
			//-about the error
			throw e;
		}
		return message;
	}

}
