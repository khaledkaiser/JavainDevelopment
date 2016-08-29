package cararraylistexample;

public class Car1 {
	
	private String Make;
	private String Model;
	private int Year;
	
	public Car1(String make, String model, int year){
		this.Make = make;
		this.Model = model;
		this.Year = year;
	}
	
	public String getMake(){
		return this.Make;
	}
	
	public String setMake(String newMake){
		return (this.Make = newMake);
	}
	
	public String getModel(){
		return this.Model;
	}
	
	public String setModel(String newModel){
		return (this.Model = newModel);
	}
	public int getYear(){
		return this.Year;
	}
	
	public int setYear(int newYear){
		return (this.Year = newYear);
	}
	@Override
	public String toString(){
		return String.format("%s\t%s\t%f\n",this.Make, this.Model, this.Year);
	}

}
