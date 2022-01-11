import java.util.*;
public class Q9Lab6Try {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letter;
		
		System.out.printf("Enter: ");
		while(input.hasNext() ) {
			
			letter = input.next();
			char l = letter.toUpperCase().charAt(0);
			
			
			switch(l) {
			case 'A': case 'E': case 'I': case 'O':
				System.out.println("The letter "  + letter.charAt(0) + " is a vowel");
				break;
			default:
				System.out.println("The letter " + letter.charAt(0) + " is a constant");
				break;
			}//end switch
			
			
			System.out.printf("Enter: ");
			
		}


	}

}
