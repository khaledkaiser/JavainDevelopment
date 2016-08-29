package cararraylistexample;

import java.util.ArrayList;

public class CarArrayListExample {

	
	public static void main(String[] args) {
//		ArrayList<Car1> carlist101 = new ArrayList<Car1> ();
		ArrayList<Car2> carlist102 = new ArrayList<Car2> ();
		
//		adding some cars - Model-1(Car1(Make, Model, Year))
		
//		carlist101.add(new Car1("Toyota", "Camry", 1992));
//		carlist101.add(new Car1("Honda", "Accord", 2008));
//		carlist101.add(new Car1("Nissan", "Maxima", 2013));
		
//		Access as a collection
		
//		System.out.printf("Make\tModel\tYear\n");
//		
//		for(Car1 c:carlist101){
//			System.out.printf("%s\n", c);
//		}
		
//		adding some cars - Model-2(Car2(Make, Year))
		
		carlist102.add(new Car2("Toyota", 1992));
		carlist102.add(new Car2("Honda", 2008));
		carlist102.add(new Car2("Nissan", 2013));
		
//		Access as a collection
		
		System.out.printf("Make\tModel\n");
		
		for(Car2 c:carlist102){
			System.out.printf("%s\n", c);
		}

	}

}
