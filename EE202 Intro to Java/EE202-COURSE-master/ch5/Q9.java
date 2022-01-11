import java.util.Scanner;

public class Q9{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		
		
		while(input.hasNext() ) {
			
			System.out.print("Input a letter: ");	
			String letter = input.next();
			char l;
			l = letter.toUpperCase().charAt(0);
			
			switch(l ) {
			case 'A': case 'E': case 'I': case 'U':
				System.out.println("\nThe letter " + letter.charAt(0) + " is a vowl");
				break;
			default:
				System.out.println("\nThe letter " + letter.charAt(0) + " is a constatnt");
				break;
			
			}//end switch
			
			
		}
		
		
	}
}//end class