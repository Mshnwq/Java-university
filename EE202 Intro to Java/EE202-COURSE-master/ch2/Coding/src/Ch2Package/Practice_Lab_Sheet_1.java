package Ch2Package;
import java.util.Scanner;
public class Practice_Lab_Sheet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q1
		int x = 100;
		int y = 22; 
		System.out.println(x * y + 4 / 3);
		
		//Q2
		System.out.println((8 * 4 * 2 + 6) / 2 + 4);
		
		//Q3-a)
		System.out.println("1 2 3 4 ");
		
		//Q3-b)  I DID NOT KNOW! SEE YA LATER!!
		
		
		//Q3-c)
		System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
		
		//Q4
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.print("Enter first integer: ");
		n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		n2 = input.nextInt();
		System.out.println("Sum is: " + (n1 + n2));
		System.out.println("Product is: " + (n1 * n2));
		System.out.println("Difference is: " + (n1 - n2));
		System.out.println("Quotient is: " + (n1 / n2));
		
		//Q5
		String firstName, lastName;
		System.out.print("Enter your first name: ");
		firstName = input.next();
		System.out.print("Enter your last name: ");
		lastName = input.next();
		System.out.println("Good Morning "+firstName+" "+lastName+".How are you?");
		
		//Q6 a looong question!
		
		//Q7
		int mynum;
		System.out.print("Input a number: ");
		mynum = input.nextInt();
		System.out.println("Expected Output: ");
		for(int i = 1; i < 11; i++)
			System.out.printf("%d * %d = %d%n", mynum, i, (mynum * i));
		
		//Q8
		System.out.println(((25.5*3.5-3.5*3.5)/(40.5-4.5)));
		
		//Q9
		System.out.println(4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));
		
		//Q10
		double r = 7.5;
		System.out.println("Radius = "+ r);
		System.out.println("Perimeter is =" + 2 * Math.PI * r);
		System.out.println("Area is = " + Math.PI * r * r);
		
		//Q11
		System.out.print("Input number: ");
		int myNum = input.nextInt();
		System.out.println("Square: "+ myNum * myNum);
		System.out.println("Cube: "+ myNum * myNum * myNum);
		System.out.println("Fourth power: "+ myNum*myNum*myNum*myNum);
		
		//Q13-a)
		System.out.println(7 + 3 * 6 / 2 -1);
		//Q13-b)
		System.out.println(2 % 2 + 2 * 2 - 2 /2);
		//Q13-c)
		System.out.println(3 * 9 * (3 + (9 * 3/ (3))));
		
		
				
		
		
		
		
		
		
		
		
		
		
	}

}
