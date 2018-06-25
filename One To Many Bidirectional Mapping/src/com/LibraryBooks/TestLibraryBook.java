package com.LibraryBooks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestLibraryBook {

	static SessionFactory sf=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args)
{
//	   SaveRecord();
		getRecord();
		//UpdateRecord();
	    //DeleteRecords();
		
}
	public static void getRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		List st=s.createQuery("from LibraryDTO").list();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			LibraryDTO p=(LibraryDTO)itr.next();
			System.out.println("Library Name: " +p.getLname());
			System.out.println("College Name: " +p.getCname());
	        Set set=p.getChild();
	        Iterator itr1=set.iterator();
	        
	        while(itr1.hasNext())
	        {
	        	BooksDTO doc=(BooksDTO)itr1.next();
	        	System.out.println("\tBook Name: " + doc.getBname());
	        	System.out.println("\tBook Type: " + doc.getBtype());
	        	
	        }
	     }
		s.close();
		
	}


	/*public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		LibraryDTO v=new LibraryDTO();
		v.setLid(154);
		v.setCname("VIT");
		v.setLname("Central");
		BooksDTO b1=new BooksDTO();
		b1.setBid(1);
		b1.setBname("c++");
		b1.setBtype("prog");
		
		BooksDTO b2=new BooksDTO();
		b2.setBid(2);
		b2.setBname("Java");
		b2.setBtype("prog");
		
		BooksDTO b3=new BooksDTO();
		b2.setBid(3);
		b2.setBname("APJ");
		b2.setBtype("Biography");
		
		//ONE-TO-MANY...........................................
		
		
		Set set=new HashSet();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		v.setChild(set);
		
		
		//MANY-TO-ONE............................................
		
		
		b1.setObj(v);
		b2.setObj(v);
		b3.setObj(v);
	    
		//Insert Or Save Data Into A field
		s.save(b1);
		//s.save(v);
		
		t.commit();
		s.close();
		
	}*/

}
