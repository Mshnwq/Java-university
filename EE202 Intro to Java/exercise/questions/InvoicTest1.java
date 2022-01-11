package excersice;

public class InvoicTest1 {

	public static void main(String[] args) {
		
		Invoic1 invoic1 = new Invoic1("1234", "Hammer","", 2, 14.95);
		invoic1.diplayInfo();
		invoic1.askUser();
		
		Invoic1 invoic12 = new Invoic1("5678", "Paint", "Bursh", -4, -2.3);
		invoic12.diplayInfo();
		invoic12.askUser();
		
	}
}
