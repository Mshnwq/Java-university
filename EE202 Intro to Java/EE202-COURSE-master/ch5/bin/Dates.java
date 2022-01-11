import java.util.Scanner;
public class Dates {
	public static void main(String[] args) {
		int day, month, year;
		int daysIntMonth;
		boolean dayValid =false, monthValid = false, yearValid = false;
		boolean leapYear = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter day: ");
		day = scan.nextInt();
		System.out.print("Enter month: ");
		month = scan.nextInt();
		System.out.print("Enter year: ");
		year = scan.nextInt();
		
		
		if(month>=1 && month<=12) {
			monthValid = true;
		}
		else {
			monthValid = false;
		}
		
		if(year>=1000 && year<=1990) {
			yearValid = true;
		}
		else {
			yearValid = false;
		}
		
		
		if(yearValid) {
			
			if( (year % 400 == 0) || ( (year % 4 == 0) && ( year % 100 !=0) ) ) {
				
				leapYear = true;
			}
			else {
				leapYear = false;
			}
			
		}
		
		
		
		
		if(leapYear) {
			if(month == 2) {
				if(day>=1 && day<=29) {
					dayValid = true;
				}
				else {
					dayValid = false;
				}
			}
			else {
				dayValid = true;
			}
				
				
			
		}
		else {
			if(month == 2) {
				if(day>=1 && day<=28) {
					dayValid = true;
				}
				else {
					dayValid = false;
				}
				dayValid = true;
			}
			dayValid = true;
			
		}
		
		System.out.println(dayValid + " " + monthValid + " " + yearValid);
		System.out.println(leapYear);
		if(dayValid && monthValid && yearValid ) {
			System.out.println("Date is valid");
			if(leapYear) {
				System.out.println("Leap Year");
			}
			
		}
		else {
			System.out.println("Date is not valid");
		}
		
	}//end main

}//end class
