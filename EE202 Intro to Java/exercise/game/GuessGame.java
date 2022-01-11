public class GuessGame{

//declartion objects of Player class
Player p1 = new Player();
Player p2 = new Player();
Player p3 = new Player();

//Check
boolean p1IsRight = false;
boolean p2IsRight = false; 
boolean p3IsRight = false;

//numbers of players
int p1Number;
int p2Number;
int p3Number;



//method
public void startGame(){
	System.out.println("I'm thinking of a number between 0 and 9...");
	
	
	while (true){
	
	int targetNumber = (int) (Math.random() * 10);
	System.out.println("Number to guess is " + targetNumber);
	
	p1.guess();
	p2.guess();
	p3.guess();
	
	p1Number = p1.number;
	p2Number = p2.number;
	p3Number = p3.number;
	
	System.out.println("Player one guessed " + p1Number);
	System.out.println("Player two guessed " + p2Number);
	System.out.println("Player three guessed " + p3Number);
	
	if (p1Number == targetNumber){
		p1IsRight = true;
	}
	if(p2Number == targetNumber){
		p2IsRight = true;
	}
	if(p3Number == targetNumber){
		p3IsRight = true;
	}
	
	if(p1IsRight || p2IsRight || p3IsRight){
		System.out.println("We have a winner!");
		
		System.out.println("Player one got it right? " + p1IsRight);
		System.out.println("Player two got it right? " + p2IsRight);
		System.out.println("Player three got it right? " + p3IsRight);
		
		System.out.println("Game is over.");
		break;
		
	}
	
	System.out.println("Players will have to try again");
	
	
	
	
	
	
		
	}//while end	
  }//startGame end
}//class end