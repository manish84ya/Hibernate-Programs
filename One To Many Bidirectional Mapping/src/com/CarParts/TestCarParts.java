package com.CarParts;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCarParts {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
public static void main(String[] args)
{
	saveRecord();
	//DeleteRecord();
}
public static void DeleteRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	CarDTO c=(CarDTO)s.get(CarDTO.class,101);
	s.delete(c);
	t.commit();
	s.close();
}
public static void saveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	CarDTO c=new CarDTO();
	c.setCid(101);
	c.setCname("M800");
	c.setCtype("normal");
	
	
	PartDTO p1=new PartDTO();
	p1.setPid(01);
	p1.setPname("Engine");
	p1.setPtype("4-s");
	
	PartDTO p2=new PartDTO();
	p2.setPid(02);
	p2.setPname("Tyre");
	p2.setPtype("MRF");
	
	PartDTO p3=new PartDTO();
	p3.setPid(03);
	p3.setPname("Tube");
	p3.setPtype("Relaxo");
	
	Set set=new HashSet();
	set.add(p1);
	set.add(p2);
	set.add(p3);
	c.setChild(set);
	//s.save(c);
	
	p1.setObj(c);
	p2.setObj(c);
	p3.setObj(c);
	s.save(p1);
	t.commit();
	s.close();
}
}
