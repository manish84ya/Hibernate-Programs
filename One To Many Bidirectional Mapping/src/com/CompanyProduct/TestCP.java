package com.CompanyProduct;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCP {
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
		List st=s.createQuery("from CompanyDTO").list();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			CompanyDTO p=(CompanyDTO)itr.next();
			System.out.println("Company Name: " +p.getCname());
	        Set set=p.getChild();
	        Iterator itr1=set.iterator();
	        
	        while(itr1.hasNext())
	        {
	        	ProductDTO doc=(ProductDTO)itr1.next();
	        	System.out.println("\tProduct Name: " + doc.getPname());
	        }
	     }
		s.close();
		
	}


	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		CompanyDTO v=new CompanyDTO();
		v.setCid(123);
		v.setCname("ChOiCe");
		
		ProductDTO c1=new ProductDTO();
		c1.setPid(31);
		c1.setPname("Chocalate");
		c1.setPtype("choco");
		
		ProductDTO c2=new ProductDTO();
		c2.setPid(32);
		c2.setPname("ChocoBar");
		c2.setPtype("IceCream");
		ProductDTO c3=new ProductDTO();
		c3.setPid(33);
		c3.setPname("Parle");
		c3.setPtype("Biscuit");
		
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
		//s.save(c3);
		s.save(v);
		
		t.commit();
		s.close();
		
	}

}
