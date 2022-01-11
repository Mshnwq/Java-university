package Ch2Package;
// if I used a default package I do not need to write a package name in the beginning of the programm
import java.util.Scanner; //java.util--package, Scanner--class
import java.lang.System;//if I write this or not it will not happen anything 
//I have to import before the class

public class LecCh2 {//CLASS

	public static void main(String[] args) { //METHOD
		// I have to memorize this line!
		// TODO Auto-generated method stub
		//words in bold -I can not use this words for variable
		//public --access modifier
		//End line comment
		/*
		 * Traditional comment
		 */
		
		/**
		 * javado for html
		 */
		
		//void- means will not return any data or info
		//main- the name of the method
		
		System.out.println("Welcome to Java Programming!");
		//System --class
		//System.out--object
		//System.out.println--method
		//() - anything inside the () is called "argument"
		
		System.out.printf("Welcome %s Java %s", "to", "programming!");
		//%s- a place holder
		//double stores a large than float
		
		/*
		 * Steps for running a java program in cmd
		 ** write "javac <name of the class>" -- to create a class file inside the package
		 ** from src file type "java <name of the package>.<name of the Class>"
		 */
		
		/* To use Class inside anothor class
		 ** import the class
		 ** create object 
		 */
		
		Scanner input = new Scanner(System.in);
		//Scanner --the name of the class
		//input--the name of the object
		//new--create an object
		//Scanner--the class
		//System.in--standard input stream to let the user write data inside
		
		int number1;//type name of var;
		int number2; 
		int sum;
		
		System.out.print("Enter the first integer: "); //prompt--ask the user to enter the data
		number1 = input.nextInt();//input-object, input.--after dot it will appear all methods 
		
		//Why I create object from a specific class? to use some methods inside the class
		
		
		
	}

}
