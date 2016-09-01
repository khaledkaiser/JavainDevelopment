package caruser;

public class Address
{
	private int _houseno;
	private String _street;
	private String _city;
	private int _zip;
	private String _state;
	
	public Address(int houseno, String street, String city, int zip, String state)
	{
		this._houseno = houseno;
		this._street = street;
		this._city = city;
		this._zip = zip;
		this._state = state;
	}
	
//	setters			
	public void setHouseNo(int houseno){this._houseno = houseno;}
	public void setStreet(String street){this._street = street;}
	public void setCity(String city){this._city = city;}
	public void setZip(int zip){this._zip = zip;}
	public void setState(String state){this._state = state;}
	
//	getters
	public int getHouseNo(){return this._houseno;}
	public String getStreet(){return this._street;}
	public String getCity(){return this._city;}
	public int getZip(){return this._zip;}
	public String getState(){return this._state;}
	
	

	@Override
	public String toString()
	{
		return String.format("%d\t%s\t%s\t%d\t%s", this._houseno, 
				this._street, this._city, this._zip, this._state);
	}

}
