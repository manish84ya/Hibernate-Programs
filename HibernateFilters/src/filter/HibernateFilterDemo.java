package filter;

import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Filter;
import util.HibernateUtil;
import data.Flight;
/**
 * Hibernate Filter Demo
 * 
 * @author ashutosh_sharma03
 * 
 */
public class HibernateFilterDemo
{
	public static void main(String argsp[])
	{
		//First obtain the sessionFactory handle and then open the session
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		 
		//create the data ready for application
		/*
		insertData("DL6149", "RIC", "JFK", "ontime",session);
		insertData("CO1948", "EWR", "PHX", "delayed",session);
		insertData("AI0101","JFK","DEL","delayed",session);
		insertData("US1987","LAX","SFO","ontime",session);
		insertData("NW3482","JFK","ATL","cancelled",session);
		insertData("9W5432","JFK","BOM","ontime",session);
		insertData("AI0102","JFK","DEL","ontime",session);
		*/
		// you can comment out insert statements above once the data has been setup.


		//show the entire data
		//System.out.println("Showing all the flights");
		 //showData(session);

		//First enable the filter on the session
		Filter filter = session.enableFilter("statusFilter");
		
		// show delayed flights		
		filter.setParameter("statusParam", "delayed");
		System.out.println("Showing all the delayed flights");
		//showData(session);
		
		//show flights ontime
		filter.setParameter("statusParam", "ontime");
		//System.out.println("Showing all the flights ontime");
		//showData(session);
		
		//show cancelled flights.
		//System.out.println("Showing all the cancelled flights");
		filter.setParameter("statusParam", "cancelled");
		//showData(session);

		//disabling the filter will show all the flights once again
		session.disableFilter("statusFilter");
		showData(session);
		
		//finally close the session as we are done
		session.close();
	}

	public static void insertData(String flightNo, String source,
			String destination, String status, Session session)
	{
		session.beginTransaction();

		Flight flight = new Flight();
		flight.setFlightNo(flightNo);
		flight.setSource(source);
		flight.setDestination(destination);
		flight.setStatus(status);

		session.save(flight);
		session.getTransaction().commit();
	}

	public static void showData(Session session)
	{
		session.beginTransaction();
		Query query = session.createQuery("from Flight");
		System.out.println("Flight"+"\tSource"+"\tDestn"+"\tStatus");
		Iterator <Query> iter = query.iterate();
		while (iter.hasNext())
		{
			Flight flight = (Flight) iter.next();			
			System.out.print(flight.getFlightNo() + "\t"
					+ flight.getSource() + "\t" + flight.getDestination());
			if (flight.getStatus().equalsIgnoreCase("ontime"))
			{
				System.out.print("\t" + flight.getStatus());
			}
			if (flight.getStatus().equalsIgnoreCase("delayed"))
			{
				System.out.print("\t" + flight.getStatus());
			}
			if (flight.getStatus().equalsIgnoreCase("cancelled"))
			{
				System.out.print("\t" + flight.getStatus());
			}
			System.out.println();
		}
		session.getTransaction().commit();
	}
}