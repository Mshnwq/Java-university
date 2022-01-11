package excersice;

public class Date {

	private int month;
	private int day;
	private int year;
	
	public Date(int m, int d, int y) {

		this.month = m;
		this.day = day;
		this.year = y;
	}
	
	//setMethods
	public void setMonth(int m) {
		this.month = m;
	}
	public void setDay(int d) {
		this.day = d;
	}
	public void setYear(int y) {
	
		this.year = y;
	}
	
	//getMethods
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	
	//displayDate method
	
	public void displayDate() {
		System.out.println(month + "/"+ day + "/" + year );
	}
	
	
}
