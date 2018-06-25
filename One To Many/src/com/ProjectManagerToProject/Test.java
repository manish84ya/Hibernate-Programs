package com.ProjectManagerToProject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BankCustomer.Bank;
import com.BankCustomer.BankCustomer;

public class Test {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args) {
		//saveRecord();
	    getRecord();
		//DeleteRecords();
		//UpdateRecords();
	}
	public static void getRecord()
	{
		Session s=sf.openSession();
		Object obj=s.get(ProjectManager.class,new Integer(101));
		ProjectManager b=(ProjectManager)obj;
		
		System.out.println(b.getPmid()+" "+b.getPname());
		
		Set set=b.getChild();
		
		Iterator itr=set.iterator();
		System.out.println("\nProject Details Are:");
		while(itr.hasNext())
		{
			Project bc=(Project)itr.next();
			System.out.println(bc.getPid()+" "+bc.getPname());
			
		}
		
}	
public static void saveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	ProjectManager pm=new ProjectManager();
	pm.setPmid(101);
	pm.setPname("Raman");
	
	Project p=new Project();
	p.setPid(458);
	p.setPname("ebay");
	
	Project p1=new Project();
	p1.setPid(441);
	p1.setPname("open");
	
	Project p2=new Project();
	p2.setPid(48);
	p2.setPname("rewind");
	
	Set set=new HashSet();
	set.add(p);
	set.add(p1);
	set.add(p2);
	pm.setChild(set);
	s.save(pm);
	t.commit();
	
}


}
