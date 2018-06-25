package com.BookPages;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestBookPages {

	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
{
	   SaveRecord();
		getRecord();
		//UpdateRecord();
	    //DeleteRecords();
}




	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		BookDTO v=new BookDTO();
		v.setBid(1);
		v.setBname("C++");
		
		PagesDTO c1=new PagesDTO();
		c1.setCpid(1);
		c1.setPno("10");
		
		
		PagesDTO c2=new PagesDTO();
		c2.setCpid(2);
		c2.setPno("25");
		
		PagesDTO c3=new PagesDTO();
		c3.setCpid(3);
		c3.setPno("28");
		
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
	public static void getRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		List st=s.createQuery("from BookDTO").list();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			BookDTO p=(BookDTO)itr.next();
			System.out.println("Book Name: " +p.getBname());
	        Set set=p.getChild();
	        Iterator itr1=set.iterator();
	        
	        while(itr1.hasNext())
	        {
	        	PagesDTO doc=(PagesDTO)itr1.next();
	        	System.out.println("\tPage Number: " + doc.getPno());
	        }
	     }
		s.close();
		
	}

}
