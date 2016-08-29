package cararraylistexample;

public class Car2 {
	
	private String Make;
	private int Year;
	
	public Car2(String make, int year){
		this.Make = make;
		this.Year = year;
	}
	
	public String getMake(){
		return this.Make;
	}
	
	public String setMake(String newMake){
		return (this.Make = newMake);
	}
	
	public int getYear(){
		return this.Year; 
	}
	
	public int setYear(int newYear){
		return(this.Year = newYear);
	}
	
	@Override
	
	public String toString(){
		return String.format("%s\t%d", this.Make, this.Year );
	}

}
