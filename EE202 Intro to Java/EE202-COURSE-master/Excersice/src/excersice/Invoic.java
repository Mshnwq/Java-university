package excersice;
public class Invoic {

	private String partNumber;
	private String partDescribiton;
	private int quantity ;
	private double price;
	private double invoiceAmount;
	
	
	public Invoic(String pN, String pD, int q, double p) {

		this.partNumber = pN;
		this.partDescribiton = pD;
		if (q < 0) {
			q = 0;
		}
		if (p < 0) {
			p =0.0;
		}
		this.quantity = q;
		this.price = p;
		
	}
	
	//setMethods
	public void setPartNmber(String pN) {
		this.partNumber = pN;
	}
	
	public void setPartDescribition(String pD) {
		this.partDescribiton = pD;
	}
	
	public void setQuantity(int q) {
		if (q<0) {
			q = 0;
		}
		this.quantity = q;
	}
	
	public void setPrice(double p) {
		if (p <0) {
			p =0.0;
		}
		this.price = p;
	}
	
	
	//getMethods
	public String getPartNumber() {
		return partNumber;
	}
	
	public String getPartDescribiton() {
		return partDescribiton;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double  getPrice() {
		return price;
	}
	
	//getInvoic method
	public void getInvoicAmount() {
		invoiceAmount = price * quantity;
		
	}
	
	//displayInfo
	public void displayInfo() {
		System.out.println("Part Number: " + partNumber);
		System.out.println("Describition: " + partDescribiton);
		System.out.printf("Quantity: %d%n", quantity);
		System.out.printf("Price : %.2f%n", price);
		System.out.printf("Invoice amount: %.2f%n", invoiceAmount);
		System.out.println();//New line
		
	}
	
	
	
}
