package com.VehicleOwner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.PatientDoctor.Doctor;
import com.PatientDoctor.Patient;

public class TestVehicleOwner {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		saveRecord();
//		getRecord();
		//DeleteRecords();
		//UpdateRecords();
	}
	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Owner o=new Owner();
		o.setOid(105);
		o.setOname("chandu");
		o.setOmob(4587);
		
		Vehicle v=new Vehicle();
		v.setVid(587);
		v.setVname("safari");
		v.setObj(o);
		
		Vehicle v1=new Vehicle();
		v1.setVid(783);
		v1.setVname("Nano");
		v1.setObj(o);
		
		Vehicle v2=new Vehicle();
		v2.setVid(786);
		v2.setVname("Swift");
		v2.setObj(o);
		
		s.save(v);
		s.save(v1);
		s.save(v2);
	
		t.commit();
		s.close();
		}


}
