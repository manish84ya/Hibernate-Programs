package com.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestPersonAdhar {
static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Mapping");
static EntityManager em=emf.createEntityManager();

public static void main(String[] args) 
{
	saveRecord();

}
public static void  saveRecord()
{
	em.getTransaction().begin();
	AdharDTO adr=new AdharDTO();
	adr.setAid(1256);
	adr.setCity("Panna");
	adr.setAdr("920");
	adr.setDob("16/03/1992");
	adr.setMob("9600007925");
	adr.setPin(488442);
	
	
	PersonDTO p=new PersonDTO();
	p.setPid(1);
	p.setGen("Male");
	p.setPname("Manish");
	p.setParent(adr);
	em.persist(p);
	em.getTransaction().commit();
	em.close();
}

}
