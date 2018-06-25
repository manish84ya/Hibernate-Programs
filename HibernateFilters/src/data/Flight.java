package data;

/**
 * Flight
 * 
 * @author ashutosh_sharma03
 * 
 */
public class Flight
{
	private int id;
	private String flightNo;
	private String source;
	private String destination;
	private String status;
	
	public int getId()
	{
		return id;
	}
	private void setId(int id)
	{
		this.id = id;
	}
	
	public String getFlightNo()
	{
		return flightNo;
	}
	public void setFlightNo(String flightNo)
	{
		this.flightNo = flightNo;
	}
	public String getSource()
	{
		return source;
	}
	public void setSource(String soruce)
	{
		this.source = soruce;
	}
	public String getDestination()
	{
		return destination;
	}
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}	
}
