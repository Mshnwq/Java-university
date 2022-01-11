import java.util.Scanner;

public class Practice {
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			/*
			double principal = 1000.00;
			double interest = 0.05;
			int year = 1; 
				
			System.out.println("Year\tAmount on deposit");	
			for(; year<=10; year++){
				principal += principal * interest;
				System.out.printf("%d \t %,.2f\n", year, principal);
				
			}//end for loop	
			*/
			
			
			/*
			String firstName = "Asma ";
			String lastName = "Abdullah Sarouji";
			
			System.out.printf("%20s\n", firstName);
			System.out.printf("%20s\n", lastName);
			*/
			
			/*
			int counter = 1; 
			
			do{
				System.out.print(counter);
				counter++;
				
			}while(counter<=10);
			System.out.println();
			System.out.println(counter);
			
			int counter2 = 1; 
			while(counter2<=10){
				System.out.print(counter2);
				counter2++;
				
				
				
			}
			System.out.println();
			System.out.print(counter2);
			*/
			
			/*
			System.out.println("Enter the integer grades in the range 0-100.");
			System.out.println("Type the end-of-file indicator to terminate input: ");
			System.out.printf("  %s\n  %s\n", "On UNIX/Linux/macOs type <Ctrl> d then press Enter","On Windows type <Ctrl> z then press Enter");
			int grade,
				totalGrades = 0,
				counter = 0,
				aCounter = 0,
				bCounter = 0,
				cCounter = 0,
				dCounter = 0,
				fCounter = 0;
				
				
			double average;	
			
			while(input.hasNext()){
				grade = input.nextInt();
				totalGrades +=grade;
				counter++;
				
				switch(grade/10){
					case 10:
					case 9:
					aCounter++;
					break;
					
					case 8:
					bCounter++;
					break;
					
					case 7:
					cCounter++;
					break;
					
					case 6: 
					dCounter++;
					break;
					
					default:
					fCounter++;
					break;
					
					
				}//end swithc
				
				
			}//end while looooop
			System.out.println();
			System.out.println("Grade Report: ");
			System.out.println("Total of the " + counter + " grades entered is " + totalGrades);
			System.out.printf("%s %.2f\n", "Class average is ", (double)totalGrades/ counter);
			
			System.out.println();
			System.out.println();
			System.out.println("Number of students who received each grade: ");
			System.out.println("A: " + aCounter);
			System.out.println("B: " + bCounter);
			System.out.println("C: " + cCounter);
			System.out.println("D: " + dCounter);
			System.out.println("F: " + fCounter);
			*/
			
			/*
			System.out.println("Enter name");
			String name = input.next();
			
			while(input.hasNext() ){
				System.out.println(input.hasNext());
				name = input.next();
				
			}
			System.out.println(input.hasNext());
			
			*/
			
			/*
			int sum = 0;
			for(int i = 1; i<=5; i +=2){
				sum +=i;
			}
			System.out.print(sum);
			*/
			
			/*
			double sum = 1;
			for(int i = 1; i<=17; i +=2){
				sum += (double)i/(i+2);
			}
			
			System.out.println(sum);
			*/
			
			
			/*
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			for(int i = 1; i <= number; i++){
				
				int k = 1;
				for(; k<= number-i; k++){
					
					System.out.print(" ");
				}
				
				for(int j = 1; j<=i; j++){
					System.out.print("* ");
				}
				System.out.println();
			}
			
			*/
			
			/*
			System.out.print("Enter a  number: ");
			int number = input.nextInt();
			
			for(int i = number; i>=1; i--){
				int k = 1;
				for(; k<= number - i; k++){
					System.out.print(" ");
				}
				for(int j = 1; j<=i; j++){
					System.out.print("* ");
				}
				
				System.out.println();
			}
			*/
			
			/*
			System.out.print("Enter number: ");
			int number = input.nextInt();
			
			switch(number){
				case 1: 
				System.out.println("Sunday");
				break;
				
				case 2: 
				System.out.println("Monday");
				break;
				
				case 3: 
				System.out.println("Tuesday");
				break;
				
				default: 
				System.out.println("Error input!");
			}
			*/
			
			/*
			
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			for(int i = 1; i<=number; i++){
				int j = i;
				for(; j>=1; j--){
					System.out.print(j*j + " ");
				}
				
				
				System.out.println();
			}
		
			*/
			
			double sum = 0,
				j = 30,
				p;
				
				for(int i = 1; i<=30; i++){
					p = Math.pow(-1, i+1);
					sum +=(i/j) *p;
					j--;
				}
				System.out.print(sum);
				
	}//end main methos
	
}//end class