public class DogClass{
	
	
	
	void bark(int n){
		
		
		while (n > 0){
			System.out.println("HOOOHOO");
			
			n--;
			
		}//end while #NO.1
	}//end bark method
	
	
	public static void main(String[] args){
		
		DogClass myDog = new DogClass();
		myDog.bark(8);
		
	}//end main method
	
}//end class