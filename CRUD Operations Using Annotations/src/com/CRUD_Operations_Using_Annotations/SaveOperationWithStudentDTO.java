package com.CRUD_Operations_Using_Annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class SaveOperationWithStudentDTO {
public static void main(String[] args)
{
	AnnotationConfiguration cfg=new AnnotationConfiguration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	StudentDTO obj=new StudentDTO();
	obj.setSname("Chandan");
	obj.setRollumber(1056);
	obj.setBranch("Computer");
	obj.setYear("2");
	s.save(obj);
	t.commit();
	s.close();
	
	
}
}
