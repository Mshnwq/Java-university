package ch3Package;

public class PetrolPurchase {

	//instance var--five!
	private String stationLocation;
	private String petrolType;
	private int quantity;
	private double price;
	private double discount;
	
	//Constructor that initialize the five instance variables
	public PetrolPurchase(String stationLocation, String petrolType, int quantity, double price, double discount) {
		this.stationLocation = stationLocation;
		this.petrolType = petrolType;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
	}
	
	//set methods: !!
	public void setStationLocation(String stationLocation) {
		this.stationLocation = stationLocation;
	}
	
	public void setPetrolType(String petrolType) {
		this.petrolType = petrolType;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	//get methods: !!
	
	public String getStationLocation() {
		return stationLocation;
	}
	
	public String getPetrolType() {
		return petrolType;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	//method for calculate the net purchase amount
	public double getPurchaseAmount() {
		return ((quantity * price ) - discount);
	}
	
	
	
	
	
	
	
	
	
	
}
