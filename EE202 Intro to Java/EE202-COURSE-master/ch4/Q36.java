import java.util.Scanner;
public class Q36{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int number1, number2;
		while(true){
			System.out.print("Enter number1: ");
			number1 = input.nextInt();
			
			System.out.print("Enter number2: ");
			number2 = input.nextInt();
			
			if(number1 > number2){
				System.out.println(1);
			}
			else if(number1 < number2){
				System.out.println(-1);
			}
			else{
				System.out.println(0);
			}
			
			
		}
	}//end main method
}//end class