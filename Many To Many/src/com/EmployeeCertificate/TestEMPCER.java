package com.EmployeeCertificate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEMPCER 
{
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args)
	{
		//SaveRecord();
		GetRecord();
		
	}
	public static void GetRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		List l=s.createQuery("From EmployeeDTO").list();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			EmployeeDTO emp=(EmployeeDTO)itr.next();
			System.out.println("Employee ID:"+emp.getEid());
			System.out.println("Employee Name:"+emp.getEname());
			System.out.println("Employee Salary:"+emp.getSalary());
			Set crt=emp.getCertificates();
			Iterator itr1=crt.iterator();
			while(itr1.hasNext())
			{
				CertificateDTO c=(CertificateDTO)itr1.next();
				System.out.println("Certificate ID:"+c.getCid());
				System.out.println("Certificate Name:"+c.getCname());
				System.out.println("Completion Year:"+c.getYoc());
				
			}
			System.out.println("-----------------------------------");
				
		}
		
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		CertificateDTO crt=new CertificateDTO();
		crt.setCid(100);
		crt.setCname("Hadoop");
		crt.setYoc("2015");
		
		
		CertificateDTO crt1=new CertificateDTO();
		crt1.setCid(101);
		crt1.setCname("Laravel");
		crt1.setYoc("2016");
		
		EmployeeDTO e=new EmployeeDTO();
		e.setEid(500);
		e.setEname("Manish");
		e.setSalary(25000);
		
		EmployeeDTO e1=new EmployeeDTO();
		e1.setEid(501);
		e1.setEname("Chandan");
		e1.setSalary(27000);
		
		Set set=new HashSet();
		set.add(e);
		set.add(e1);
		
		crt.setEmployee(set);
		crt1.setEmployee(set);
		s.save(crt);
		s.save(crt1);
		t.commit();
		s.close();
	}
}


