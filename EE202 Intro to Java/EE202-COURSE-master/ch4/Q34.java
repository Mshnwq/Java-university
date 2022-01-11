import java.util.Scanner;
public class Q34{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int num, value, sum ;
		System.out.print("Enter num: ");
		num = input.nextInt();
		
		System.out.print("reading integer values....");
		value = input.nextInt();
		sum = value;
		
		while( sum < num){
			System.out.print("reading integer values....");
		    value = input.nextInt();
			
			sum +=value;
			
			
		}//end while
		
		System.out.println(num == sum ? "equal" : "sum is begger!");
		
	}//end main method
}//end class