package com.Hibernate1;



import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDelete {

	public static void main(String[] args)
	{
		EmployeeDTO obj=new EmployeeDTO();
		obj.setId(9);
		Session session=SessionFactoryClass.getSession();
		Transaction t=SessionFactoryClass.getTransaction();
		session.delete(obj);
		t.commit();
		session.close();
	}
}
