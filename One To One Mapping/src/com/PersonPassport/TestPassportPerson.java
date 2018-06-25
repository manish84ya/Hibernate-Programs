package com.PersonPassport;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class TestPassportPerson {

	
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		//Update();
		SaveRecord();
		//GetRecord();
		//DeleteRecord();
	}
	
	public static void SaveRecord()
	{	
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		PersonDTO p1=new PersonDTO();
		
		p1.setPid(2);
		p1.setPname("Chandan");
		
		PassportDTO pss=new PassportDTO();
		
		pss.setIssueD("23-03-2017");
		pss.setExpD("23-04-2034");
		pss.setPpage(30);
		
		pss.setPp(p1);
		s.save(pss);
		t.commit();
		s.close();
	}

}
