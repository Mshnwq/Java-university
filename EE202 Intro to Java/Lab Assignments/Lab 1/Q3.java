package lab.assignment;
import java.util.Scanner;

public class Q3 
{
	public static void main(String[] args) 
	{
		int val1, val2, val3;
		double average;
		Scanner scan = new Scanner(System.in);
		// get three values from user
		System.out.println("Please enter three integers and I will compute their average");
		System.out.print("Enter the first integer: "); val1 = scan.nextInt();
		System.out.print("Enter the second integer: "); val2 = scan.nextInt();
		System.out.print("Enter the third integer: "); val3 = scan.nextInt();
		//compute the average
		average = Double.valueOf(val1 + val2 + val3) / 3;
		//print the average
		System.out.printf("The Average is: %f%n", average);
		}
	}