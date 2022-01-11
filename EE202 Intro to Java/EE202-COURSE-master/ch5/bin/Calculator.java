
public class Calculator {

	//instance variables
	private double number1;
	private double number2;
	
	//constructors
	public Calculator(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	//methods
	public void checkDif() {
		String s = (number1-number2 > 0? "Positive": "Negative");
		System.out.println(s);
	}
	
}
