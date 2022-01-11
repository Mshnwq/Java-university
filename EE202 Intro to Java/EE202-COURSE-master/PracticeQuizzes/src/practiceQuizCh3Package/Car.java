package practiceQuizCh3Package;

public class Car {
	//instance var
	private String type;
	private String year;
	private double price;
	
	
	//constructor
	public Car(String type, String year, double price) {
		this.type = type;
		this.year = year;
		if(price > 0 ) {
			this.price = price;
			
		}
	}
	
	//setMethods
	public void setPrice(double price) {
		if (price >0) {
			this.price = price;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	
	

}
