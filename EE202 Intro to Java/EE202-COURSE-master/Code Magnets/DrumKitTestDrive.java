class DrumKitTestDrive{
	public static void main(String [] args){
		
		//creat object
		DrumKit d = new DrumKit();
		
		if(d.snare == true && d.topHat == true){
			d.playSnare();
			d.playTapHat();
		}//end if condition
		
	}//end main method
	
}//end class