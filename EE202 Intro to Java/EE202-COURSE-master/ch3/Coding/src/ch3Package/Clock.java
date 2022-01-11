package ch3Package;

public class Clock {

	//instance variables
	private int hr;
	private int min;
	private int sec;
	
	//constructors
	public Clock(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
		
		
	}
	
	//setMethods:
	public void setHr(int hr) {
		if (hr > 23) {
			this.hr = 0;
			this.min = 0;
			this.sec = 0;
		}
		else {
			this.hr = hr;
		}
	}
	
	
	public void setMin(int min) {
		if (min > 59) {
			this.min = 0;
			this.hr = 0;
			this.sec = 0;
		}
		else {
			this.min = min;
		}
	}
	
	
	public void setSec(int sec) {
		if (sec > 59) {
			this.sec =0;
			this.min = 0;
			this.hr = 0;
		}
		else {
			this.sec = sec;
		}
	}
	
	public int getHr(){
		return hr;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getSec() {
		return sec;
	}
	
	public void displayTime() {
		System.out.printf("The time is:%n%d:%d:%d%n",  hr, min, sec);
	}
	
	
}
