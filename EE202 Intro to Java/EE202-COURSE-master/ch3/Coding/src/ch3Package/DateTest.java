package ch3Package;
import java.util.*;
public class DateTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Date myDate = new Date(2020, 9, 13);
		System.out.println("Default:");
		System.out.println("Year:"+ myDate.getYear());
		System.out.println("Month:"+myDate.getMonth());
		System.out.println("Day:"+ myDate.getDay());
		
		
		System.out.print("Enter the year:");
		int year = input.nextInt();
		myDate.setYear(year);
		
		System.out.println("Date:" );
		//I can use println cuz displayDate method is "void method"
		myDate.displayDate();
	
	}

}
