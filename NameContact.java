package caruser;

public class NameContact
{
	private String _lastname;
	private String _firstname;
	private String _email;
	private long _phone;
	
	public NameContact(String lastname, String firstname, String email, long phone)
	{
		this._lastname = lastname;
		this._firstname = firstname;
		this._email = email;
		this._phone = phone;			
	}
	
//	setters
	
	public void setLastName(String lastname){this._lastname = lastname;}		
	public void setFirstName(String firstname){this._firstname = firstname;}
	public void setEmail(String email){this._email = email;}
	public void setPhone(long phone){this._phone = phone;}
	
//	getters
	
	public String getLastName(){return this._lastname;}
	public String getFirstName(){return this._firstname;}
	public String getemail(){return this._email;}
	public long getphone(){return this._phone;}
	
	@Override
	public String toString()
	{
		return String.format("%s\t\t%s\t\t%s\t\t%d", this._lastname, this._firstname, 
				this._email, this._phone);
	}
	} 
