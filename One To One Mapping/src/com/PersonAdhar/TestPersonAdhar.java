package com.PersonAdhar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPersonAdhar {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		//Update();
		SaveRecord();
	//	GetRecord();
		//DeleteRecord();
	}	
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		AdharDTO s1=new AdharDTO();
		s1.setUid(12);
		s1.setPaddress("920");
		s1.setDob("16-03-92");
		PerDTO p=new PerDTO();
		p.setPname("Manish");
		p.setAdr(s1);
		s.save(p);
		t.commit();
		s.close();
		
		
	}
	
}
