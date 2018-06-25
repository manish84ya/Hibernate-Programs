package com.MysqlToHqlQueryOperations;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertQuery {

	static Session session=SessionFactoryClass.getSession();
	static Transaction t=SessionFactoryClass.getTransaction();
	CustomerDTO obj=new CustomerDTO();

	//Insert Or Create Table..HIBERNATE
    public static void SaveByHQL()
    {
    	CustomerDTO obj=new CustomerDTO();
    	obj.setFirstName("Taksh");
    	obj.setLastName("Malviya");
    	obj.setAddress("113");
    	obj.setCity("Indore");
    	obj.setContactNumber("698574");
    	obj.setPostalCode(452001);
    	obj.setCountry("India");
    	session.save(obj);
    	t.commit();
    }
}
