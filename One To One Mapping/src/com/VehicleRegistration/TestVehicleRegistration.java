package com.VehicleRegistration;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestVehicleRegistration {

	static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args)
	{
		//Update();
		//SaveRecord();
		GetRecord();
		//DeleteRecord();
	}
	public static void GetRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		List l=s.createQuery("from Vehicle").list();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Vehicle addr=(Vehicle)itr.next();
			System.out.println("\tVehicle Reg_Number: "+addr.getRegnum());
			System.out.println("\tVehicle Type: "+addr.getVtype());
			System.out.println("\tVehicle Name: "+addr.getVname());
			Registration reg=addr.getReg();
			System.out.println("\tVehicle Holder Name: "+reg.getVhname());
			System.out.println("\tVehicle  Registration Date: "+reg.getRdate());
			System.out.println("\tVehicle Registration Expiry Date: "+reg.getEdate());
			System.out.println("-------------------------------------------------");
			
			
			
		}
		
	}
	public static void SaveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Registration r=new Registration();
		r.setRid(126457);
		r.setVhname("Manish");
		
		r.setRdate("25-05-2014");
		r.setEdate("14-04-2038");
		Vehicle v1=new Vehicle();
		
		v1.setVname("Honda");
		v1.setVtype("Bike");
		v1.setReg(r);
		
		s.save(v1);
		t.commit();
		s.close();
		
		
	}
}
