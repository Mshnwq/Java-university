package ch3Package;

public class Date {

	//instance va
	private int month;
	private int day;
	private int year;
	
	//constructor
	public Date (int year, int month, int day ) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//setMethods
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay( int day) {
		this.day = day;
	}
	
	//getMethods
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	//diplayDate method
	public void displayDate() {
		System.out.println(day+ "/"+month+"/"+year);
	}
	
	
	
}
