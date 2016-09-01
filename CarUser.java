package caruser;

import java.util.ArrayList;
import java.util.List;

public class CarUser {

	
	public static void main(String[] args) 
	{
		
		List<NameContact> namecontactlist= new ArrayList<NameContact>();
		List<Address> addresslist= new ArrayList<Address>();
		
		
		namecontactlist.add(new NameContact("Kaiser", "Khaled", "khaledkaiser@gmail.com", 5616743719L));
		namecontactlist.add(new NameContact("Kaiser", "Javed", "javedkaiser@gmail.com", 5126743719L));
		
		addresslist.add(new Address(5623, "Jay Thrush Dr", "Richmond", 77407, "TX"));

		System.out.printf("Last Name\tFirst Name\tEmail\t\t\t\tPhone\n");
		System.out.println("-----------------------------------------------------------------------");
		for (NameContact nc:namecontactlist){System.out.printf("%s\n", nc);}
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("Address\n");
		System.out.println("-----------------------------------------------------------------------");
		for (Address ad:addresslist){System.out.printf("%s\n", ad);}
		System.out.println("-----------------------------------------------------------------------");
		
	}
	
}
