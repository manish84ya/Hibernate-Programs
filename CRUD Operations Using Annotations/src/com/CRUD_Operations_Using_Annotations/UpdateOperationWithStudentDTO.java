package com.CRUD_Operations_Using_Annotations;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class UpdateOperationWithStudentDTO {

	public static void main(String[] args)
	{
		GetDetailUsingList();
		
	}
	public static void GetDetailUsingList()
	{
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    StudentDTO obj=(StudentDTO)s.get(StudentDTO.class,1);
	    obj.setSname("Chan");
	    obj.setRollumber(1054);
	    s.update(obj);
	    t.commit();
	    s.close();

	}

}
