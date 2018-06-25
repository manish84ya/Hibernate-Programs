package com.StateDistict;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStateDis {

	static SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args)
{
//	   SaveRecord();
		//getRecord();
		UpdateRecord();
	    //DeleteRecords();
	//	 SaveRecord();
			
}
	
	
	

	
	public static void UpdateRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		StateDTO a=(StateDTO)s.get(StateDTO.class, new Integer(111));
		a.setSname("M.P.");
		
		DistictDTO c=(DistictDTO)s.get(DistictDTO.class, new Integer(3));
		c.setCname("Damoh");
		
		/*MANY TO ONE */
		/*Customer c=(Customer)s.get(Customer.class, new Integer(31));
		c.setCname("Manish");
		
		/*Vendor a=(Vendor)s.get(Vendor.class, new Integer(222));
		a.setVname("Reebok");*/
		
		Set set =a.getChild();
		set.add(c);
		a.setChild(set);
		s.update(c);
		t.commit();
		s.close();
	}
	

	
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		StateDTO v=new StateDTO();
		
		v.setSid(111);
		v.setSname("MP");
		
		DistictDTO c1=new DistictDTO();
		c1.setCid(1);
		c1.setCname("Panna");
		
		DistictDTO c2=new DistictDTO();
		c2.setCid(2);
		c2.setCname("Indore");
		
		DistictDTO c3=new DistictDTO();
		c3.setCid(3);
		c3.setCname("Bhopal");
		
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
