import java.util.Scanner;
public class Q21{
	public static void main(String[] args){
		
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0,
			num,
			largest;
		
		System.out.print("Enter number: ");
		num = input.nextInt();
		largest = num;
		
		while(counter < 9 ){
			if(num > largest){
				largest = num ;
			}
			
			System.out.print("Enter number: ");
			num = input.nextInt();
			
			
			
			counter++;
		}//end while loooooooop
		
		System.out.println("The larges number is: " + largest);
		
			
	}//end main method
}//end class