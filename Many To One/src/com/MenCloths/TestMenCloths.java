package com.MenCloths;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMenCloths {
static SessionFactory sf=new Configuration().configure().buildSessionFactory();
public static void main(String[] args)
{
	update();
}
public static void update()
{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	MenDTO m=(MenDTO)s.get(MenDTO.class, 1);
	m.setMname("Taksh");
	s.saveOrUpdate(m);
	t.commit();
	s.close();
}
}
