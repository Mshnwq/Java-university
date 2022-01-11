public class EchoTestDrive{
	public static void main(String[] args){
		//creat objects
		Echo e1 = new Echo();
		Echo e2 = new Echo();
		
		int x = 0;
		
		while(x<4){
			e1.hello();
			e1.count = e1.count + 1;
			
			if(x> 0){
				e2.count = e2.count + 1;
			}//end if cond. #NO.1
			
			if(x> 1){
				e2.count = e2.count + e1.count;
			}//end if cond. #NO.2
			
			//the result will be 10 if I delete if cond. #NO.3
			if(x==3){
				e2.count = e2.count + e2.count + e1.count;
			}//end if cond. #NO.3
			
			x = x + 1;
			
		}//end while
		
		System.out.println(e2.count);
	}//end main
	
}//end class