package excersice;

import java.util.Scanner;

public class Invoic1 {
	
	//instanc 4 var
	private String partNumber, partDescribtion1, partDescribtion2;
	private int quantity;
	private double price, inovicAmount;
	
	//scanner class
	Scanner input = new Scanner(System.in);
	
	//constructor
	public Invoic1(String partNumber, String partDescribtion, String partDescribtion2, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDescribtion1 = partDescribtion;
		this.partDescribtion2 = partDescribtion2;
		if(quantity > 0 ) {
			
			this.quantity = quantity;
		}
		
		if(price > 0) {
			this.price = price;
			
		}
		
	}

	//setMethod
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescribtion() {
		return partDescribtion1 + " " + partDescribtion2;
	}

	public void setPartDescribtion(String partDescribtion, String partDescribtion2) {
		this.partDescribtion1 = partDescribtion;
		this.partDescribtion2 = partDescribtion2;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0) {
			
			this.quantity = quantity;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 0 ) {
			this.price = price;
			
		}
	}
	
	//getInvoicAmount
	public void getInvoicAmount() {
		 inovicAmount = quantity * price;
	}
	//diplayInfo
	public void diplayInfo() {
		System.out.println();
		System.out.printf("Part number: %s\n", partNumber);
		System.out.printf("Describition: %s %s\n", partDescribtion1, partDescribtion2 );
		System.out.printf("Quantity: %d\n", quantity);
		System.out.printf("Price: %.2f\n", price);
		this.getInvoicAmount();
		System.out.printf("Invoic amount: %.2f\n", inovicAmount);
		System.out.println();
	}
	
	//ask user method
	public void askUser() {
		System.out.println("Updated invoic amount information");
		System.out.print("Part Number: ");
		partNumber = input.next();
		System.out.print("Describtion: ");
		partDescribtion1 = input.next();
		partDescribtion2 = input.next();
		System.out.print("Quantity: ");
		quantity = input.nextInt();
		System.out.print("Price: ");
		price = input.nextDouble();
		this.getInvoicAmount();
		System.out.printf("Invoic amount: %.2f\n", inovicAmount );
		
	}
	
	

}
