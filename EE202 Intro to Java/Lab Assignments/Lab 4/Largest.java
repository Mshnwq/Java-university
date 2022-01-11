package lab4;
import java.util.Scanner;
public class Largest 
{
	public void determineLargest()
	{
		Scanner input = new Scanner(System.in);
		int largest = 0;
		int number = 0;
		int counter = 0;

		System.out.println("Enter 10 integers");
		while (counter<10)
		{
			number = input.nextInt();
			if (number > largest)
				largest = number;
			counter++;
		}
		System.out.printf( "Largest number is %d\n", largest );
	}
}