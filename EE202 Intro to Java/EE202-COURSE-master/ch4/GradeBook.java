public class GradeBook{
	//instance var
	private String courseName, instructorName;
	
	//constructor
	public GradeBook(String cN, String iN){
		this.courseName = cN;
		this.instructorName = iN;
	}
	
	//setMethod
	public void setCourseName(String cN){
		this.courseName = cN;
	}
	
	public void setInstructorName(String iN){
		this.instructorName = iN;
	}
	
	//getMethod
	public String getCourseName(){
		return courseName;
	}
	
	public String getInstructorName(){
		return instructorName;
	}
	
	//displayMessageMethod
	public void displayMessage(){
		System.out.println("\nWelcom to the grade book for");
		System.out.println(courseName);
		System.out.println("This course is presented by: " + instructorName+ "\n");
	}
	
	public static void main(String[] args){
		
		//create objects
		GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java programming", "Sam Smith");
		
		gradeBook1.displayMessage();
		
		gradeBook1.setInstructorName("Judy Jones");
		System.out.println("Changing instrctor name to " + gradeBook1.getInstructorName());
		
		gradeBook1.displayMessage();
		
		
		
	}
	
	
}//end class