package com.MysqlToHqlQueryOperations;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class BetweenOrRange {
static Session session=SessionFactoryClass.getSession();
public static void BetweenQueryInMySQL()
{
	Query q=session.createSQLQuery("select * from e2 where salary  between 10000 and 30000");
	List<Object[]> l=q.list();
	Iterator itr=l.iterator();
	Object[] col;
	
	while(itr.hasNext())
	{
		col=(Object[])itr.next();
		Integer id=(Integer)col[0];
		String FN=(String)col[1];
		String LN=(String)col[2];
		Integer ag=(Integer)col[3];
		Integer sal=(Integer)col[4];
		System.out.println(id+" "+FN+" "+LN+" "+ag+" "+sal);

	}

}

public static void BetweenQueryHQL()
{
	Query q=session.createQuery("from EmployeeDTO e where e.salary  between 10000 and 20000");
	List l=q.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge()+" "+obj.getSalary());
			
	}
}

public static void BetweenQueryWithCriteria()
{
	Criteria crit=session.createCriteria(EmployeeDTO.class);
	crit.add(Restrictions.between("salary", 10000, 20000));
	//crit.add(Restrictions.ge("salary", 15000));
	//crit.add(Restrictions.gt("salary", 15000));
	//crit.add(Restrictions.le("salary", 15000));
	//crit.add(Restrictions.lt("salary", 25000));
	
	List l=crit.list();
	Iterator itr=l.iterator();
	EmployeeDTO obj;
	while(itr.hasNext())
	{
		obj=(EmployeeDTO)itr.next();
		System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge()+" "+obj.getSalary());
		
	}
}

}
