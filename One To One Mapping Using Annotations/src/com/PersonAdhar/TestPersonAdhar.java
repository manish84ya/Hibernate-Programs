package com.PersonAdhar;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestPersonAdhar {
static AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
static SessionFactory sf=cfg.buildSessionFactory();
public static void main(String[] args)
{
	//SaveRecord();
	//UpdateRecord();
	//DeleteRecord();
	//GetRecord();
}
public static void GetRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	List l=s.createQuery("from PersonDTO").list();
	for(Iterator itr=l.iterator();itr.hasNext();)
	{
		PersonDTO obj=(PersonDTO)itr.next();
		System.out.println("\t Person Name: "+obj.getPname());
		System.out.println("\t Person Gender: "+obj.getGen());
		AdharDTO ad=obj.getParent();
		System.out.println("\t Adhar Number: "+ad.getAid());
		System.out.println("\t Address: "+ad.getAdr());
		System.out.println("\t City: "+ad.getCity());
		System.out.println("\t Pincode: "+ad.getPin());
		System.out.println("\t Mobile Number: "+ad.getMob());
		
	}
}

public static void DeleteRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	PersonDTO p=(PersonDTO)s.get(PersonDTO.class,12);
	s.delete(p);
	t.commit();
	s.close();
	
}
public static void UpdateRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	AdharDTO obj=(AdharDTO)s.get(AdharDTO.class, 123654);
	obj.setAdr("I-365");
	PersonDTO per=(PersonDTO)s.get(PersonDTO.class,12);
	per.setParent(obj);
	s.update(per);
	t.commit();
	s.close();
	
}
public static void SaveRecord()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	AdharDTO ad=new AdharDTO();
	ad.setAid(12897);
	ad.setAdr("601");
	ad.setCity("Indore");
	ad.setDob("16-09-92");
	ad.setMob("9678547925");
	ad.setPin(452001);

	PersonDTO per=new PersonDTO();
	per.setPid(1);
	per.setGen("male");
	per.setPname("Chandan");
	per.setParent(ad);
	s.save(per);
	t.commit();
	s.close();
	
}


}