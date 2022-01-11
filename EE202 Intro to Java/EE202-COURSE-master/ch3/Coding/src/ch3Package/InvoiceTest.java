package ch3Package;
import java.util.Scanner;


public class InvoiceTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Invoice myInvoice = new Invoice("4", "nice", 4, 20.3);
		
		System.out.printf("DEFAULT:%n");
		System.out.printf("Part number is:%s%n", myInvoice.getPartNumber());
		System.out.printf("Part description is:%s%n", myInvoice.getPartDescription());
		System.out.printf("Quantity of the part is:%d%n", myInvoice.getQuantity());
		System.out.printf("The price of the part is:%f%n", myInvoice.getPrice());
		
		System.out.print("Enter price amount:");
		double price = input.nextDouble();
		myInvoice.setPrice(price);
		System.out.println("your price now is:"+ myInvoice.getPrice());
		
		System.out.println("the result of Invoice amount is:" + myInvoice.getInvoiceAmount());
		
	}

}

