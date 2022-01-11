package ch3Package;

import java.util.*;
public class Petrol {

	public static void main(String[] args) {
		//creates objects
		Scanner input = new Scanner(System.in);
		PetrolPurchase myObject = new PetrolPurchase("Jeddah", "Gas",10, 20, 0.15 );
		
		System.out.printf("The defult location by using constractor is %s%n", myObject.getStationLocation());
		System.out.print("Enter another location: ");
		String stationLocation = input.next();
		myObject.setStationLocation(stationLocation); //set the input to it
		System.out.printf("The new location now is: %s%n", myObject.getStationLocation());
		
		

	}

}
