package ch3Package;

public class Car {

	//instance variables
	private String model;
	private String year;
	private double price;
	private double discount; 
	
	//constructor
	public Car(String model, String year, double price) {
		this.model = model;
		this.year = year;
		
		if (price > 0) {
			this.price = price;
		}
	}
	
	
	//setMethods: 
	public void setModel(String model) {
		this.model= model;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;	
		}
		
	}
	
	//getMethods: 
	
	public String getModel() {
		return model;
	}
	
	public String getYear() {
		return year;
	}
	
	public  double getPrice() {
		return price;
	}
	
	public void discountMethod(double discount) {
		price = discount * price; 
	}
	
}
