package practiceQuizCh3Package;

public class HeartRates {

	//instance variable
	private String firstName;
	private String lastName;
	private int dayBirth;
	private int monthBirth;
	private int yearBirth;
	
	
	public HeartRates(String fN, String lN, int d, int m, int y) {
	this.firstName = fN;
	this.lastName = lN;
	this.dayBirth = d;
	this.monthBirth = m;
	this.yearBirth = y;
	}
	
	
	//1)method to claculate the age
	public double getAge(int currDay, int currMon, int currYear) {
		int year = currYear - this.yearBirth;
		int month = currMon - this.monthBirth;
		int day= currDay - this.dayBirth;
		
		return (year + (double)month/12 + (double)day/365);
		
	}
	
	//2)method to calculate max heart rate
	public double getMaxHeartRate(int currDay, int currMon, int currYear) {
		return 220-this.getAge(currDay, currMon, currYear);
	}
	
	//3)method to calculate heart rate
	public double getHeartRate(int currDay, int currMon, int currYear) {
		return ((50+85)/2) * this.getMaxHeartRate(currDay, currMon, currYear);
	}
	
	
	
	
	
	
	
	
}
