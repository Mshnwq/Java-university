public class Books{
	//instance var
	String title;
	String author;
	
	public static void main(String[] args){
		
		//creat array of type Books class and its length equal to three!
		Books[] myBooks = new Books[3]; //the length is three
		
		
		int x = 0;//declare and intilize var x to zero int
		while(x < myBooks.length){ //x<3
			myBooks[x] = new Books();
			x++;
		}//end while #NO.1
		
		
		
		myBooks[0].title = "The Grapes of Java";
		myBooks[0].author = "Bob";
		
		myBooks[1].title = "The Java Gatsby";
		myBooks[1].author = "Sue";
		
		myBooks[2].title = "The Java Cookbook";
		myBooks[2].author = "ian";
		
		
		x = 0;
		while(x < myBooks.length){
		
			System.out.print(myBooks[x].title);
			System.out.print(" By ");
			System.out.print(myBooks[x].author + "\n");
			
			x++;
		}
		
	}//end main
}//end class