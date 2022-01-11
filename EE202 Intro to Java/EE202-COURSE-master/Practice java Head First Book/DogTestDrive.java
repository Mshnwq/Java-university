public class DogTestDrive{
	public static void main(String [] args){
		
		Dog[] dogs= new Dog[3];
		
		dogs[0] = new Dog();
		dogs[1] = new Dog();
		dogs[2] = new Dog();
		
		dogs[0].bark(); //num says Ruff!
		
		dogs[2].name = "Bart";
		System.out.println("last dog's name is " + dogs[2].name); //last dog's name is Bart
		
		dogs[0].name = "Fred";
		dogs[1].name = "Marge";
		
		int x = 0;
		while(x < dogs.length){//dogs.length = 3  x<3
			dogs[x].bark();
			x++;
			/*
			Fred says Ruff! //loop1 x = 0
			Marge Says Ruff!// loop2 x = 1
			Bart says Ruff!// loop3 x = 2
			*/
		}//end while
		
		Dog myDog = new Dog();
		
		dogs[2] = myDog;
		
		myDog.name = "Hind!";
		
		System.out.println();
		x = 0;
		while (x < dogs.length){
			dogs[x].bark();
			x++;
		}//end while #NO.2 
		
	}//end main method
	
}//end class