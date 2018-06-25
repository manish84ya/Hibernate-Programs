package com.CRUD_Operations_Using_Annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DeleteOperationsWithStudentDTO {
public static void main(String[] args)
{
	DeleteOperation();
}
public static void DeleteOperation()
{
	AnnotationConfiguration cfg=new AnnotationConfiguration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	StudentDTO obj=(StudentDTO)s.get(StudentDTO.class,1);
	s.delete(obj);
	t.commit();
	s.close();
	
}
}
