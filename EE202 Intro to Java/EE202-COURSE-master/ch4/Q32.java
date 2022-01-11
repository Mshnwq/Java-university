import java.util.Scanner;
public class Q32{
	
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		
		int num , 
		    rem,
			counter = 1,
			div = (int) Math.pow(10,counter),
			digit;
			
		System.out.print("Enter number: ");
		num = input.nextInt();	//num = 9876
		
		
		
		
		digit = num / div;//digit = 987.6 ===987
		rem = num % div;  //rem = 6
		
		
		while( digit !=0){ 
			System.out.println("digit " + digit);
			System.out.println("remainder " + rem);
			
			
			
			
			if(rem != 0 && rem != 1){ 
				System.out.println("Not binary! " + rem); 
				
				
				
				
			}
			
			
			rem = digit % (int) Math.pow(10,1); 
			counter++; 
			div = (int) Math.pow(10,counter); //div = 100
			
			digit = num / div; //9876 / 100 ====98.76
			
			
			
		}
		
		//System.out.println("Great it's binary number!!Super Proud SAMA!");
		
		
		
	}//end main
}//end class