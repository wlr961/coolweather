package model;

public class City {

	private int id;
	private String city_name;
	private String city_code;
	private int provinceid;
	public int getId()
	{
		return id;
	}
	public String getCity_name()
	{
		return city_name;
	}
	public String getCity_code()
	{
		return city_code;
	}
	public int getProvinceid()
	{
		return provinceid;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setCity_name(String city_name)
	{
		this.city_name=city_name;
	}
	public void setCity_code(String city_code)
	{
		this.city_code=city_code;
	}
	public void setProvinceid(int provinceid)
	
	{
		this.provinceid=provinceid;
	}
}
