package com.ClassStudent;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args)
{
	   SaveRecord();
//		getRecord();
		//UpdateRecord();
	    //DeleteRecords();
}

	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		ClassDTO v=new ClassDTO();
		v.setCid(220);
		v.setCname("Science");
		
		StudentDTO c1=new StudentDTO();
		c1.setSid(31);
		c1.setSname("Manish");
		
		StudentDTO c2=new StudentDTO();
		c2.setSid(32);
		c2.setSname("Candan");
		
		StudentDTO c3=new StudentDTO();
		c3.setSid(33);
		c3.setSname("payu");
		
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
