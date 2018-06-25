package com.MysqlToHqlQueryOperations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IsEmptyByList {
   public static List emptyyy()
	{
		ArrayList al=new ArrayList();
		al.add("a");
		al.add("b");
		al.add("");
		al.add(10);
		/*Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			String v=(String)itr.next();
			System.out.println(v);
			
		}*/
		return al;
	}
	
	
	
}
