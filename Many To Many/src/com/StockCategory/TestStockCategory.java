package com.StockCategory;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestStockCategory {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{

		//SaveRecord();
		//GetRecordStudentToCourse();
		//GetRecordCourseToStudent();
		//DeleteRecordsFromStudent();
		//DeleteRecordsFromCourse();
//		UpdateRecordfromStudent();
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		StockDTO s1=new StockDTO();
		s1.setStockId(101);
		s1.setStockName("Patan");
		s1.setStockCode("7071");
		
		StockDTO s2=new StockDTO();
		s2.setStockId(102);
		s2.setStockName("Lux");
		s2.setStockCode("7086");
		
		CategoryDTO c1=new CategoryDTO();
		c1.setCategoryId(901);
		c1.setCname("Shampoo");
		c1.setDescp("hair");
		
		CategoryDTO c2=new CategoryDTO();
		c2.setCategoryId(906);
		c2.setCname("shop");
		c2.setDescp("body");
		
		Set set=new HashSet();
		set.add(c1);
		set.add(c2);
		
		s1.setCategory(set);
		s2.setCategory(set);
		
		s.save(s1);
		s.save(s2);
		t.commit();
		s.close();
		
		
	}

}
