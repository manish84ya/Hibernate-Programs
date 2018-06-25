package com.StudentAddress;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStudentAddress {
	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		//Update();
		//SaveRecord();
		GetRecord();
		//DeleteRecord();
	}
	public static void Update()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
//		StudentDTO std=(StudentDTO)s.get(StudentDTO.class, 122);
		AddressDTO adr=(AddressDTO)s.get(AddressDTO.class, 122);
		adr.setCity("Muhandra");
				
	//	std.setSname("Taksh");
		s.update(adr);
		t.commit();
		s.close();
	}

	public static void DeleteRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		AddressDTO std=(AddressDTO)s.get(AddressDTO.class, 122);
		s.delete(std);
		t.commit();
		s.close();
		
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		StudentDTO s1=new StudentDTO();
		
		s1.setSid(122);
		s1.setSname("Manish");
		
		AddressDTO adr=new AddressDTO();
		adr.setAid(920);
		adr.setCity("Panna");
		adr.setState("MP");
		adr.setSs(s1);
		s.save(adr);
		t.commit();
		s.close();
		
		
	}
	public static void GetRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		List l=s.createQuery("from AddressDTO").list();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			AddressDTO addr=(AddressDTO)itr.next();
			System.out.println("\tCity Name: "+addr.getCity());
			System.out.println("\tState Name: "+addr.getState());
			System.out.println("\tHouse Number: "+addr.getAid());
			StudentDTO st=addr.getSs();
			System.out.println("\tStudent Name: "+st.getSname());
		}
		
	}
	
}
