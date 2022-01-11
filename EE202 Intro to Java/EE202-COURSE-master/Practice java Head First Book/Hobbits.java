public class Hobbits{
	String name;
	
	public static void main(String[] args){
		Hobbits[] h = new Hobbits[3];
		
		int z = -1 ;
		
		while(z < 2){
			z++;
			h[z] = new Hobbits();
			
			h[z].name = "billbo";
			
			if(z == 1){
				h[z].name = "frodo";
			}//end if #NO.1
			
			
			if(z == 2){
			h[z].name = "sam";
		    }//end if #NO.2
			
			System.out.print(h[z].name + " is a ");
			System.out.println("good Hobbit name ");
			
		
			
		}//end while #NO.1
		
		
		
		
		
	}//end main method
	
	
}//end class Hobbits