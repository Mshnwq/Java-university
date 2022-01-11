package excersice;

public class Date1 {
	
	private int month, day, year;
	
	public Date1(int m, int d, int y) {
	
		this.month = m;
		this.day = d;
		this.year = y;
		
	}
	
	//setMethods
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
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
	
	//displayDate method
	public void displayDate() {
		System.out.println(month + "/" + day + "/" + year);
	}

}
