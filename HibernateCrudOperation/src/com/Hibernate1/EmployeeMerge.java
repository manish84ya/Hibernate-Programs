package com.Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMerge {
	public static void main(String[] args)
	{
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session1 = factory.openSession();
		 
		EmployeeDTO emp1 = null;
		Object o = session1.get(EmployeeDTO.class, new Integer(1));
		emp1 = (EmployeeDTO)o;
		session1.close();
		 
		emp1.setSalary(48000);
		
		 
		Session session2 = factory.openSession();
		EmployeeDTO emp2 = null;
		
		Object o1 = session2.get(EmployeeDTO.class, new Integer(1));
		emp2 = (EmployeeDTO )o1;
		
		Transaction tx=session2.beginTransaction();
		
		session2.merge(emp1);
		//session2.update(emp1);
		tx.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//SessionFactory sf=new Configuration().configure().buildSessionFactory();
		/*Session session1=sf.openSession();
		EmployeeDTO emp =new EmployeeDTO();
		emp.setFirstName("Manish");
		session1.saveOrUpdate(emp);
		session1.close();
		emp.setFirstName("Shree Ram");
		Session session2=sf.openSession();
		EmployeeDTO emp1=(EmployeeDTO)session2.get(EmployeeDTO.class,new Integer(1));
		//session2.update(emp1);
		session2.merge(emp1);
	   //session2.update(emp1);
		*/
		
		
		
		
		/*
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		EmployeeDTO emp =(EmployeeDTO)session.load(EmployeeDTO.class,new Integer(1));
		//t.commit();
		emp.setSalary(4570);
	    session.update(emp);
	    t.commit();
		session.close();
		emp.setFirstName("Ramesh ji");
		
		
		Session session1=sf.openSession();
		EmployeeDTO emp1 =(EmployeeDTO)session1.load(EmployeeDTO.class,new Integer(1));
		Transaction t1=session1.beginTransaction();
		//session1.update(emp);
		session1.merge(emp);
		t1.commit();
		session1.close();
	
		*/
		/*
		emp.setFirstName("Ramesh ji ");
		System.out.println("Before  merge transaction");
		//session1.merge(emp);
		session1.update(emp);
		t1.commit();
		System.out.println("After  merge transaction");
		session1.close();
		*/
	}

}
