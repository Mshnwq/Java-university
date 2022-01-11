import java.util.Scanner;
public class MohammadQ21{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0, num , largest, difference;
		
		System.out.print("Enter num: ");
		num = input.nextInt(); //num = 7;
		largest = num; //largest = num>> largest = 7;
		
		while(counter < 9){
			
			System.out.print("Enter num: ");
			num = input.nextInt(); //num = 9;
			
			difference = largest - num; //difference = largest - num>> difference = -2
			if( difference < 0){ //differnce < 0 >> 
				largest = num; //largest = 9;
			}
			
			
			counter++;
		}
		System.out.println("The larges number: " + largest);
		
	}
	
}//end 