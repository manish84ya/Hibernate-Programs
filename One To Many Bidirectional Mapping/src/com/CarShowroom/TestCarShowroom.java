package com.CarShowroom;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCarShowroom {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args)
{
	   SaveRecord();
		getRecord();
		//UpdateRecord();
	    //DeleteRecords();
}
	public static void getRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		List st=s.createQuery("from ShowroomDTO").list();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			ShowroomDTO p=(ShowroomDTO)itr.next();
			System.out.println("Showroom Name: " +p.getSname());
	        Set set=p.getChild();
	        Iterator itr1=set.iterator();
	        
	        while(itr1.hasNext())
	        {
	        	Car1DTO doc=(Car1DTO)itr1.next();
	        	System.out.println("\tCar Name: " + doc.getSname());
	        }
	     }
		s.close();
		
	}


	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		ShowroomDTO v=new ShowroomDTO();
		v.setSid(105);
		v.setSname("tata");
		v.setSloc("Indore");
		
		Car1DTO c1=new Car1DTO();
		c1.setCid(31);
		c1.setSname("m800");
		
		Car1DTO c2=new Car1DTO();
		c2.setCid(32);
		c2.setSname("swift");
		
		Car1DTO c3=new Car1DTO();
		c3.setCid(33);
		c3.setSname("i10");
		
		//ONE-TO-MANY...........................................
		
		
		Set set=new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		v.setChild(set);
		
		
		//MANY-TO-ONE............................................
		
		
		c1.setObj(v);
		c2.setObj(v);
		c3.setObj(v);
	    
		//Insert Or Save Data Into A field
		s.save(c3);
		//s.save(v);
		
		t.commit();
		s.close();
		
	}


}
