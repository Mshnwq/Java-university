public class Employee{
	
	//instance var
	String name;
	double salary;
	
	//constructors: 
	
	//default constructor
	public Employee(){
		
	}
	
	//constructor #NO.2
	public Employee(String name, double salary){
		this.name = name;
		if (salary > 0){
			this.salary = salary;
		}
	}
	//setMethods
	public void setName(String name){
		this.name = name;
	}//end setName
	
	public void setSalary(double salary){
		if(salary > 0){
			this.salary = salary;	
		}
		
	}//end setSalary
	
	//getMethods
	public String getName(){
		return name;
	}//end getName
	
	public double getSalary(){
		return salary;
	}//end getSalary
	
	
	
}//end class