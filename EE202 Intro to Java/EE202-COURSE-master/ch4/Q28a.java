public class Q28a{
	public static void main(String[] args){
		int x, y ;
		
		
		x = 9;
		y = 11;
		if(x > 10) //nothing is happening, independent statement
		if(y > 10)//true, independent statement
		System.out.println("*********"); //output ********
		else
		System.out.println("##########"); //this is for else
		System.out.println("$$$$$$$$$$$"); //independent statement always deplayed &&&&&
		/*OUTPUT
		*******
		$$$$$$$
		*/
		
		System.out.println("\n\n\n");//three lines
		
		
		x = 11;
		y = 9;
		if(x < 10) //false
		if(y > 10)//false
		System.out.println("*********");  //not printed
		else
		System.out.println("##########"); //will print	
		System.out.println("$$$$$$$$$$$");//independent statement
		
		/*OUTPUT
		############
		SSSSSSSSSSSS
		*/
		
		System.out.println("\n\n\n");//three lines
		
		x = 5;
		y = 2;
		if(y != 2)
		System.out.println("ONEONEONEONEONE");
		//System.out.println("TWOTWOTWOTWOTWO");
		else;
		System.out.println("THREETHREETHREETHREE");	
	
		
	}//end main method
	
}//end class