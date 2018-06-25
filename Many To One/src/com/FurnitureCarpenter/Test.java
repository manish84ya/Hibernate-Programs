package com.FurnitureCarpenter;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		saveRecord();
	    getRecord();
	  //  DeleteRecords();
		//UpdateRecords();
	}


	public static void getRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	
		List st=s.createQuery("from Furniture").list();
		
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			Furniture obj=(Furniture)itr.next();
		    System.out.println("Furniture Name: " +obj.getFname());
            
            Carpenter add=obj.getObj();
            System.out.println("\tCarpenter Name: " + add.getCname());
            		}
		s.close();
		
	}
	
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Carpenter c=new Carpenter();
		c.setCid(555);
		c.setCname("Bihari");
		
		Furniture f=new Furniture();
		f.setFid(111);
		f.setFname("Table");
		f.setObj(c);
		
		Furniture f1=new Furniture();
		f1.setFid(112);
		f1.setFname("Chair");
		f1.setObj(c);
		
		Furniture f2=new Furniture();
		f2.setFid(113);
		f2.setFname("Gate");
		f2.setObj(c);
		
		s.save(f);
		s.save(f1);
	    s.save(f2);
		t.commit();
		s.close();
		}

}
