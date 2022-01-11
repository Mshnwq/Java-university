import java.util.Scanner;
public class AirLineSeats {

	private final static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] seats = new int[11];
		int indexF = 1;
		int indexE = 6;
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Please type 1 for first class");
			System.out.println("Please type 2 for economy class");
			System.out.print("Choice: ");
			int choice = input.nextInt();
			
			switch(choice) {
			case 1:
				if(indexF <= 5) {
					seats[indexF] = indexF;
					System.out.println("First Class. Seat #" + indexF);
					indexF++;
					
				}
				else {
					System.out.println("First class is full, Economy Class? ");
					System.out.println("1. Yes, 2. No. Your choice: ");
					int choice2 = input.nextInt();
					if(choice2 == 1 && indexE <= 10) {
						System.out.println("Economy Class. Seat #" + indexE);
						indexE++;
						
					}
						
				}
					
				break;
			case 2:
				if(indexE <= 10) {
					seats[indexE] = indexE;
					System.out.println("Economy Class. Seat #" + indexE);
					indexE++;
					
				}
				else {
					System.out.println("Economy class is full, First Class? ");
					System.out.println("1. Yes, 2. No. Your choice: ");
					int choice2 = input.nextInt();
					if(choice2 == 1 && indexF <= 5) {
						System.out.println("First Class. Seat #" + indexF);
						indexF++;
						
					}
					
				}
				
				
			}
			System.out.println();
		}
		
		
	}//end main
}//end classs
