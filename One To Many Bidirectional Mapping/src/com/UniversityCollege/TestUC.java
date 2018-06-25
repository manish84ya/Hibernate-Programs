package com.UniversityCollege;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestUC {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args)
   {
	   //SaveRecord();
//		getRecord();
		//UpdateRecord();
	    DeleteRecords();
}

	public static void DeleteRecords()
	{
		Session s=sf.openSession();
		//Vendor b=(Vendor)s.get(Vendor.class,new Integer(221));
		CollegeDTO c=(CollegeDTO)s.get(CollegeDTO.class, new Integer(31));
		Transaction t=s.beginTransaction();
		s.delete(c);
		t.commit();
		s.close();
		
	}

	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		UniversityDTO v=new UniversityDTO();
		v.setUid(155);
		v.setUname("RGPV");
		
		CollegeDTO c1=new CollegeDTO();
		c1.setCid(41);
		c1.setCname("sgo");
		
		CollegeDTO c2=new CollegeDTO();
		c2.setCid(42);
		c2.setCname("Bansal");
		
		CollegeDTO c3=new CollegeDTO();
		c3.setCid(43);
		c3.setCname("gujrati");
		
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
