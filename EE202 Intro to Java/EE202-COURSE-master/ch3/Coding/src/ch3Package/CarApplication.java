package ch3Package;
import java.util.*;
class CarApplication {

	public static void main(String[] args) {
		//creat objects:
		Scanner input = new Scanner(System.in);
		Car myCar1 = new Car("BMW", "2020", -5);
		Car myCar2 = new Car("Honda", "2018", 1);
		
		System.out.printf("%s it's price is: %f%n", myCar1.getModel(), myCar1.getPrice() );
		
		System.out.print("Enter the price: ");
		double price = input.nextDouble();
		myCar1.setPrice(price);
		System.out.printf("the price is : %f%n", myCar1.getPrice());
		
		System.out.print("Enter the discount: ");
		double discount = input.nextDouble();
		myCar1.discountMethod(discount);
		
		System.out.printf("The price after discount is: %f%n", myCar1.getPrice());
		
		
	}

}
