import java.util.Scanner;

public class Q24{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int result;
		
		System.out.print("Enter (1 = pass, 2 = fail) : ");
		result = input.nextInt(); //result = 2
		            
			//(true && false )
		while(result != 1 && result !=2){
			System.out.println("Error input!");
			System.out.print("Enter (1 = pass, 2 = fail) : ");
			result = input.nextInt();
			
		}
		
	}//end main method
	
}//end class