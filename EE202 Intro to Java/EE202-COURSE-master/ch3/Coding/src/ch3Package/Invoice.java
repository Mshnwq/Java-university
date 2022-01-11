package ch3Package;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	public Invoice(String partNumber, String partDescription,int quantity,double price   ) { //constructor
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setPartNumber( String partNumber ) {
		this.partNumber = partNumber;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getInvoiceAmount() {
		if(quantity < 0) {
			quantity = 0;
		}
		
		if(price < 0) {
			price = 0.0;
		}
		
		return quantity * price;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public String getPartNumber() {
		return partNumber;
		
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
}
