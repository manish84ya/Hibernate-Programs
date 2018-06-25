package com.Save_Operation_Using_Annotations;

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
	obj.setSname("manish");
	obj.setRollumber(1042);
	obj.setBranch("Computer");
	obj.setYear("3");
	s.save(obj);
	t.commit();
	s.close();
	
	
}
}
