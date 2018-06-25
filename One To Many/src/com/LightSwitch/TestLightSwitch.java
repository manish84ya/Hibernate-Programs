package com.LightSwitch;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestLightSwitch {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
public static void main(String[] args)
{
	getRecord();
	
}
public static void getRecord()
{
	Session s=sf.openSession();
	List l=s.createQuery("from LightDTO").list();
	Iterator itr=l.iterator();
	while(itr.hasNext())
	{
		LightDTO lg=(LightDTO)itr.next();
		System.out.println("\tLight Type: "+lg.getLtype());
		Set set=lg.getChild();
		Iterator itr1=set.iterator();
		while(itr1.hasNext())
		{
			SwitchDTO sw=(SwitchDTO)itr1.next();
			System.out.println("\tSwithc Type: "+sw.getStype());
			
		}
		System.out.println("-----------------------------------");
		
		
	}
}


}
