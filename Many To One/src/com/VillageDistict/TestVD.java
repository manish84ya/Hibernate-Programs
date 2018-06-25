package com.VillageDistict;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestVD {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
	//saveRecord();
	    //getRecord();
	    DeleteRecords();
		//UpdateRecords();
	}
	 public static void DeleteRecords() 
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
       Village std=(Village)s.get(Village.class,185);
	    s.delete(std);
		t.commit();
		s.close();
	}
	 public static void saveRecord()
		{
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			Distict d=new Distict();
			d.setDid(35);
			d.setDname("panna");
			
			Village v=new Village();
			v.setVid(1);
			v.setVname("Muhandra");
			v.setObj(d);
			
			Village v1=new Village();
			v1.setVid(2);
			v1.setVname("Simariya");
			v1.setObj(d);

			Village v2=new Village();
			v2.setVid(3);
			v2.setVname("Raipura");
			v2.setObj(d);

			s.save(v1);
			s.save(v);
			s.save(v2);
			
			t.commit();
			s.close();
			}

}
