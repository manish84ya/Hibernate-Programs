package com.DepartmentEmployee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BankCustomer.Bank;
import com.BankCustomer.BankCustomer;

public class TestDepartmentEmployee 
{
      static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	   public static void main(String[] args) {
			//saveRecord();
			getRecord();
			//DeleteRecords();
			//UpdateRecords();
		}
		
	   public static void saveRecord()
	   {
		   Session s=sf.openSession();
		   Department d=new Department();
		   d.setDid(101);
		   d.setDname("Mechanical");
		   Employee e=new Employee();
		   e.seteId(111);
		   e.seteName("Shiv");
		   Employee e1=new Employee();
		   e1.seteId(112);
		   e1.seteName("manish");
		  Set s1=new HashSet();
		  s1.add(e);
		  s1.add(e1);
		  d.setChild(s1);
		  s.save(d);
		  Transaction t=s.beginTransaction();
		  t.commit();
	}
	   
	  public static void getRecord()
	   {
		   
		  Session s=sf.openSession();
			Object obj=s.get(Department.class,new Integer(101));
			Department d=(Department)obj;
			
			System.out.println(d.getDid()+" "+d.getDname());
			Set set=d.getChild();
			Iterator itr=set.iterator();
			System.out.println("\nEmp Details Are:");
			while(itr.hasNext())
			{
				Employee ec=(Employee)itr.next();
				System.out.println(ec.geteId()+" "+ec.geteName()+" "+ec.getFid());
				
			}
		
	   }
		
		
	}


