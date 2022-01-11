package practiceQuizCh3Package;

public class Clock {

	//instanc variable
	private int hour;
	private int min;
	private int sec;
	
	
	//constructor
	public Clock(int hour, int min, int sec) {
	
		if((hour > 23) || (min > 59) || (sec > 59)) {
			hour = 0;
			min = 0;
			sec = 0;
		}
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	//setMethod
	public void setHour(int hour) {
		if(hour > 23) {
			hour = 0;
		}
		this.hour = hour;
	}
	
	
	
	
	//getMehtod
	public int getHour() {
		return hour;
	}
	
	public int getMin() {
		return min;
	}
	
	
	//display method
	public void displayTime() {
		System.out.printf("%f:%2d:%2d%n", hour, min, sec);
	}
	
	
	
	
	
	
}
