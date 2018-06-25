package com.PatientDoctor;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CustomerVendor.Customer;
import com.CustomerVendor.Vendor;
import com.StudentAddress.Address;
import com.StudentAddress.Student;

public class TestPatientDoctor {
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
		Transaction t=s.beginTransaction();
	
		List st=s.createQuery("from Patient").list();
		
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			Patient p=(Patient)itr.next();
			
			System.out.println("Patient ID: " + p.getPid()); 
            System.out.println("Patient Name: " +p.getPname());
            System.out.println("Patient Diseases : " +p.getDiseases());
            
            Doctor doc=p.getObj();
            
            System.out.println("Patient ");
            System.out.println("\tDoctor_ID: " + doc.getDid());
            System.out.println("\tDoctor Name: " + doc.getDname());
        }
		s.close();
		
	}

	public static void saveRecord()
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Doctor d=new Doctor();
		d.setDid(155);
		d.setDname("Mr Gupta");
		
	    Patient p=new Patient();
		p.setPid(101);
		p.setPname("rohan");
		p.setDiseases("feaver");
		p.setObj(d);
		
		Patient p1=new Patient();
		p1.setPid(102);
		p1.setPname("raman");
		p1.setDiseases("Poison");
		p1.setObj(d);	
		
		s.save(p);
		s.save(p1);
	
		t.commit();
		s.close();
		}
}
