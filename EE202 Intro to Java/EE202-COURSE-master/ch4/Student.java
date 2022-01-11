public class Student{
	//instance var
	private String firstName, lastName;
	private double e1, e2, e3;
	
	//constructor
	public Student(String fN, String lN, double e1, double e2, double e3){
		this.firstName = fN;
		this.lastName = lN;
		
		if(e1 >= 0){
			this.e1 = e1;
		}
		if(e2 >= 0){
			this.e2 = e2;
		}
		
		if(e3 >= 0 ){
			this.e3 = e3;
		}
		 
	}
	
	//setMethods
	public void setFirstName(String fN){
		this.firstName = fN;
	}
	
	public void setLastName(String lN){
		this.lastName = lN;
	}
	
	public void setFirstGrade(double e1){
		if(e1 >= 0){
			this.e1 = e1;
		}
	}
	
	public void setSecondGrade(double e2){
		if(e2 >= 0){
			this.e2 = e2;
		}
	}
	
	public void setThirdGrade(double e3){
		if(e3 >= 0){
			this.e3 = e3;
		}
	}
	
	//getMethod
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	
	public double getFirstGrade(){
		return e1;
	}
	
	public double getSecondGrade(){
		return e2;
	}
	
	public double getThirdGrade(){
		return e3;
	}
	
	//getAverageMethod
	public double getAverage(){
		return (e1 + e2 + e3)/3;
	}
	
	
}//end class