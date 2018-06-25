package com.AtmCust;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAtmCust {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
public static void main(String[] args)
{
	SaveRecord();
}
public static void SaveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	AtmDTO a=new AtmDTO();
	a.setAid(101);
	a.setAname("SBI");
	a.setAplace("LIG");
	
	CustDTO c=new CustDTO();
	c.setCid(501);
	c.setCname("Manish");
	c.setCnumber("12365487");
	c.setCpin("8754");
	
	CustDTO c1=new CustDTO();
	c1.setCid(502);
	c1.setCname("Chandan");
	c1.setCnumber("126524487");
	c1.setCpin("8865");
	Set set=new HashSet();
	set.add(c);
	set.add(c1);
	a.setChild(set);
	s.save(a);
	t.commit();
	s.close();
}
}
