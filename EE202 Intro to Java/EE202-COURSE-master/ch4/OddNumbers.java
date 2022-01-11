import java.util.Scanner;
public class OddNumbers{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of terms is: ");
		int num = input.nextInt();
		System.out.println();
		int i = 1;
		int j = 1;
		int sum = 0;
		System.out.println("The odd numbers are :  ");
		while(j <=num){
			if(i%2 != 0){
				sum +=i;
				System.out.println(i);
				j++;
			}
			i++;
			
		}
		System.out.println("The Sum of odd Natural Number up to " + num + " terms is: " + sum);
	}//end main method
}//end class