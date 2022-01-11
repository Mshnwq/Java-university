package excersice;

import java.util.Scanner;

public class TempTest1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Temp1 temp1 = new Temp1();
	
		System.out.print("Input a degree in fah: ");
		double feh = input.nextDouble();
		temp1.setFeh(feh);
		
		System.out.printf("%.1f degree faherneight is equal to %.15f in celuis\n", feh, temp1.toCeluis());
	}

}
