import java.util.Random;
import java.util.Scanner;
public class practice {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		/*
		for(int i = 1; i<=4; i++){
			for(int k = 1; k<= 4-i; k++ ){
					System.out.print(" ");
				}//end k loop
			
			for(int j = 1; j<=i; j++){
				
				
				System.out.print(i + " ");
				
				
				
			}//end j loop
			System.out.println();
			
		}//i for loop
		*/
		
		System.out.println("\n\n");//two line
		
		for(int i = 1; i<=5; i++){ //i = 4
				for(int j = 1; j<=i; j++){ //j=1,j = 2
					if(i % 2 == 0){//i is even
						if( j%2 !=0){//j is odd
							System.out.print(0);
						}
						else{//j is even
							System.out.print(1);
						}
					}
					else{//i is odd
						if( j%2 !=0){//j is odd
							System.out.print(1);
						}
						else{//j is even
							System.out.print(0);
						}
						
					}
					
				}
				
				System.out.println();
				
			}//end i for loop
			
			System.out.println("\n\n");
			int k = 0;
			
			for(int i = 1; i<=4; i++){//i=3;
				
				
				for(int j = 1; j<=i; j++){
					k++;
					System.out.print(k + " ");
					
					
					
				}
				System.out.println();
			}
			
			System.out.println("\n\n");
			
			for(int i = 1; i<=4; i++){
				for(int j = 1; j<=i; j++){
					System.out.print(i);
				}
				System.out.println();
			}
			System.out.println("\n\n");
			
			/*
			System.out.print("Input number of row: ");
			int row = input.nextInt();
			for(int i = 1; i<=row; i++){
				for(int j = 1; j<=i; j++){
					System.out.print(j);
				}
				
				System.out.println();
				
			}
			
			*/
			
			System.out.println("\n\n");
			
			/*
			
			System.out.print("Input the number: ");
			int number = input.nextInt();//number = 34521
			int counter = 0,
				div = (int)Math.pow(10, counter),
				sum = 0,
				result =  number / div, 
				rem;
				
			while(result !=0 ){//
				
				//System.out.println( "remainder "+ result % 10);
				rem = result % 10;
				
				counter++; //counter = 1;
				div =(int) Math.pow(10, counter);
				result = number /div;
				//System.out.println( " result " +result);
				
				
				
				sum +=rem;
				
				
			}
			System.out.println("Sum of digit=" + sum);
			
			*/
			
			System.out.println("\n\n");
			
			/*
			System.out.print("Input nuber of terms is: ");
			int number = input.nextInt();
			int i = 1,
				sum = 0,
				counter = 1;
			while(counter <= number){
				if(i % 2 != 0){
					System.out.println(i);
					sum +=i;
					counter++;
					
				}
				
				i++;
			}	
			
			System.out.println("The sum of Odd Natural Number Upto " + number + " terms is: " + sum);
			*/
			
			/*
			System.out.println("Input the 5 number: ");
			int num, counter = 1, sum = 0;
			while(counter <= 5){
				num = input.nextInt();
				sum +=num;
				counter++;
			}
			System.out.println("The sum of 5 no is: " + sum);
			System.out.printf("The Average is: %.1f\n " ,(double) sum / 5);
			*/
			
			/*
			double check;
			
			for(int i = 1; i<500; i++){
				for(int j = 1; j<500; j++){
					check = Math.sqrt(Math.pow(i,2) + Math.pow(j,2));
					if((int) check >= 500){
						break;
					}
					
					if( check - Math.floor((int)check) == 0 ){
						System.out.println("s1: " + i + " s2: " + j + " h: " + (int) check);
						
					}
				}
			}
			
			*/
			
			
			/*
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			int numberOfDigits = 0;
			int div = (int)Math.pow(10, numberOfDigits); 
			int check = number/div; 
			int rem;
			
			
			while(check != 0){ //how many digits of number?
				numberOfDigits++;
				div = (int)Math.pow(10,numberOfDigits);
				check = number/ div;
				
			}
			
			
			int reverse = 0;
			int power = 0;
			div = (int)Math.pow(10, power); 
			check = number/div;
			
			for(int i = numberOfDigits; i>=1; i--){
				
				rem = check % 10;
				//System.out.println("rem " + rem); //Great!
				
				reverse += rem * Math.pow(10, i-1); 
				//System.out.println("reverse is: " + reverse);
				power++;
				div = (int)Math.pow(10, power); 
			    check = number/div;
				
				
				
			}
			System.out.println("The reverse number is:  " + reverse);
			System.out.println("Sum of the number and reveral : " + (number + reverse));
			
			*/
			
			int numerator = 0, denominator = 2;
			double sum = 1;
			while(numerator <17){
				numerator++; //1
				//System.out.println("numerator =  " + numerator);
				denominator++;//3
				//System.out.println("denominator " + denominator);
				
				if(numerator % 2 != 0 && denominator  % 2 != 0 ){
					sum += ((double )numerator/denominator);
					//System.out.println("Sum = " + sum);
				}
				
				
				
				
				
			}
			System.out.println("The result is: " + sum);
			
			System.out.println("\n\n");
			
			/*
			
			System.out.print("Input first number:  ");
			int number1 = input.nextInt();
			System.out.print("Input second number: ");
			int number2 = input.nextInt();
			System.out.print("Input thirs number:  ");
			int number3 = input.nextInt();
			
			if(number2 > number1 && number3 > number2){
				System.out.println("Increasing");
			}
			else if(number2 < number1 && number3<number2){
				System.out.println("Decreasing");
			}
			else{
				System.out.println("Neither increasing or decreasing order");
			}
			
			*/
			
			/*
			for(int i = 1; i<=2; i++){
				for(int j = 1; j<=3; j++){
					for(int c = 1; c <=4; c++){
						System.out.print("*");	
					}
					System.out.print("!");
					
				}
				
				System.out.println();
			}
			*/
			
			Random rand = new Random();
			int b = rand.nextInt(20) + 50;
			System.out.println(b);
			System.out.println(33 % 7);
			
			
			
	}//end main method
	
	
}//end classs