package com.PessengerBus;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestPB {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		//saveRecord();
	    //getRecord();
	    //DeleteRecords();
		UpdateRecords();
	}

	
	
	
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Bus b =new Bus();
		b.setBid(3536);
		b.setBname("Hans");
		b.setSd("indore");
		b.setLd("Bhopal");
		
		Pessenger p=new Pessenger();
		p.setPid(101);
		p.setPname("MANISH");
		p.setPdest("Bhopal");
		p.setObj(b);
		
		Pessenger p1=new Pessenger();
		p1.setPid(102);
		p1.setPname("Chandan");
		p1.setPdest("Dewas");
		p1.setObj(b);
		
		Pessenger p2=new Pessenger();
		p2.setPid(103);
		p2.setPname("Payal");
		p2.setPdest("Bhopal");
		p2.setObj(b);
		s.save(p);
		s.save(p1);
		s.save(p2);
		t.commit();
		s.close();
		}
	public static void UpdateRecords()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Bus add=(Bus)s.get(Bus.class,3536);
		add.setLd("Sagar");
		s.update(add);
		t.commit();
		s.close();
	}

}
