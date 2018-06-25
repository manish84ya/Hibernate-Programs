package com.PessengerTrain;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.StudentAddress.Address;
import com.StudentAddress.Student;

public class TestPessengersTrain {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		//saveRecord();
		//UpdateRecords();
		getRecords();
	}
	
	public static void getRecords()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	List st=s.createQuery("from Pessengers").list();
		
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			Pessengers obj=(Pessengers)itr.next();
			System.out.println("Pessenger ID: " + obj.getPid()); 
            System.out.println("Pessenger Name: " +obj.getPname());
            System.out.println("Pessenger age: " +obj.getPage());
            Train add=obj.getObj();
            
            System.out.println("Trains ");
            System.out.println("\tTrain Name: " + add.getTname());
         
		}
		s.close();
	
	}
	
}
