package practiceQuizCh3Package;

public class Date {
	//instance variable
	private int day;
	private int month;
	private int year;
	
	//constroctur num1
	public Date() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor num2
	public Date(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	//setMethods
	public void setDay(int d) {
		this.day = d;
	}
	public void setMonth(int m) {
		this.month = m;
	}
	public void setYear(int y) {
		this.year = y;
	}
	
	//getMethods
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	public void displayDate() {
		System.out.println(day + "/" + month + "/" + year);
	}
	
	
}
