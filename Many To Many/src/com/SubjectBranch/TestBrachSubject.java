package com.SubjectBranch;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestBrachSubject {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		//saveRecord();
		 getRecord();
	}
	public static void getRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		List l=s.createQuery("from BranchDTO").list();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			BranchDTO b=(BranchDTO)itr.next();
			System.out.println("Branch Name:"+b.getBname());
			List sub=s.createQuery("from SubjectDTO").list();
			Iterator it=sub.iterator();
			while(it.hasNext())
			{
				SubjectDTO s1=(SubjectDTO)it.next();
				System.out.println("Subject Name:"+s1.getSname());
				System.out.println("Subject desc:"+s1.getSdesc());
			}
			
		}
	}
public static void saveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	SubjectDTO s1=new SubjectDTO();
	s1.setSid(999);
	s1.setSname("java");
	s1.setSdesc("Program");
	
	SubjectDTO s2=new SubjectDTO();
	s2.setSid(888);
	s2.setSname("M-1");
	s2.setSdesc("Math");
	BranchDTO b=new BranchDTO();
	b.setBid(444);
	b.setBname("cs");
	
	BranchDTO b1=new BranchDTO();
	b1.setBid(333);
	b1.setBname("civil");
	
	Set set=new HashSet();
	set.add(b);
	set.add(b1);
	s1.setBranch(set);
	s2.setBranch(set);
	s.save(s1);
	s.save(s2);
	t.commit();
	s.close();
			

}
}
