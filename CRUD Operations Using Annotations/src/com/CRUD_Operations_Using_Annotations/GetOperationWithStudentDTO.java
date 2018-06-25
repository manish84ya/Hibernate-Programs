package com.CRUD_Operations_Using_Annotations;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetOperationWithStudentDTO {

	public static void GetDetailUsingSingleID()
	{
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    StudentDTO obj=(StudentDTO)s.get(StudentDTO.class,1);
	    System.out.println("\tStudent Name: "+obj.getSname());
	    System.out.println("\tStudent Roll_Number: "+obj.getRollumber());
	    System.out.println("\tStudent Year: "+obj.getYear());
	    System.out.println("\tStudent Branch: "+obj.getBranch());
	    
	    s.close();

	}
	public static void GetDetailUsingList()
	{
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    
		List l=s.createQuery("From StudentDTO").list();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			StudentDTO obj=(StudentDTO)itr.next();
			System.out.println("\tStudent Name: "+obj.getSname());
		    System.out.println("\tStudent Roll_Number: "+obj.getRollumber());
		    System.out.println("\tStudent Year: "+obj.getYear());
		    System.out.println("\tStudent Branch: "+obj.getBranch());
		    System.out.println("--------------------------------------------------");
			
			  
		}
		  
	    s.close();

	}


	public static void main(String[] args)
	{
		GetDetailUsingSingleID();
		//GetDetailUsingList();
	}
}
