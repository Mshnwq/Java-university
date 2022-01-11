package excersice;
import java.util.Scanner;
public class InvoicTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//invoic1 constructor info
		Invoic invoic1 = new Invoic("1234", "Hammer", 2, 14.95);//invoic1-oject1
		invoic1.getInvoicAmount();
		System.out.println("Original invoic inforamiton");
		invoic1.displayInfo();
		
		//invoic1--updated
		invoic1.setPartNmber("001234");
		invoic1.setPartDescribition("Yellow Hammer");
		invoic1.setQuantity(3);
		invoic1.setPrice(19.49);
		invoic1.getInvoicAmount();//method for calculate InvoicAmount
		
		System.out.println("Updated invoice information");
		invoic1.displayInfo();
		/////////////////////////////////////////////////////////////
		//Create new object!
		Invoic invoic2 = new Invoic("5678", "paint Brush", -3, -3.2);//inovic2
		invoic2.getInvoicAmount();
		System.out.println("Original invoic inforamiton");		
		invoic2.displayInfo();
		
		//updated inovic2
		invoic2.setQuantity(3);
		invoic2.setPrice(9.49);
		invoic2.getInvoicAmount();//Method for calculate invoic Amount
		System.out.println("Updated invoice information");
		invoic2.displayInfo();
	}
	
}
