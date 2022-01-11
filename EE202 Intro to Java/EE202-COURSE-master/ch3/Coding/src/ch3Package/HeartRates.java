package ch3Package;

import java.time.LocalDate;
import java.util.Calendar;

public class HeartRates {
	//instance var
	private String firstName;
	private String lastName;
	private int age;
	
	//constructor
	public HeartRates(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
		
	//setMethods
	public void setFirstName( String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void DateOfBirth(int  year, int month, int day) {
		LocalDate birthDate = LocalDate.of(year, month, day);
		LocalDate now = new LocalDate(Calendar.YEAR, Calendar.MONTH, Calendar.Day);
	}
	
	






}
	
	
	
	
	
	
	
	
	
	
	
}
	


