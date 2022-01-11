public class Q29abcd{
	public static void main(String[] args){
		
		int x, y;
		
		x = 5;
		y = 8;
		
		if(y == 8)
		if(x == 5)
		System.out.println("@@@@@@@@@");
		else
		System.out.println("#########");
		System.out.println("$$$$$$$$$$");
		System.out.println("&&&&&&&&&&&");
			
		
		/* a) 
		
		OUTPUT
		@@@@@@@
		$$$$$$$
		&&&&&&&
		
		*/
		System.out.println();//line
		
		if(y == 8)
		if(x == 5)
		System.out.println("@@@@@@@@@");
		else{
		System.out.println("#########");
		System.out.println("$$$$$$$$$$");
		System.out.println("&&&&&&&&&&&");
		}
		
		/* b)
		OUTPUT
		@@@@@@@@@
		*/
		
		System.out.println();//line
		
		if(y == 8)
		if(x == 5)
		System.out.println("@@@@@@@@@");
		else{
		System.out.println("#########");
		System.out.println("$$$$$$$$$$");}
		System.out.println("&&&&&&&&&&&");
		/* c)
		OUTPUT
		@@@@@@@@
		&&&&&&&&
		
		*/
		
		System.out.println();//line
		
		x = 5;
		y = 7;
		
		if(y == 8){
		if(x == 5)
		System.out.println("@@@@@@@@@");}
		else
		System.out.println("#########");
		System.out.println("$$$$$$$$$$");
		System.out.println("&&&&&&&&&&&");
		/* d)
		########
		$$$$$$$$
		&&&&&&&&
		
		*/
		
	
		
	}//end main method
	
}//end class