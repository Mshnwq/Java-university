package excersice;

import java.util.Scanner;

public class Practicing {
	
	public static void main(String[] args) {
		
		String str1 = "Asma Sarouji";
		//System.out.println(str1.substring(2, 4)); //4-2 = 2 --just two letter from 2 up to 4 but include 4
		
		
		System.out.println(str1.indexOf("X")); //-1 , no letter X
		
		System.out.println("Enter");
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		System.out.println(money);
	}

}
