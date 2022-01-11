
public class EmployeeTest{
	public static void main(String[] args){
		Employee employee1 = new Employee();
		
		System.out.println("The defulat name and salary in employee1 is: ");
		System.out.println("Name: " + employee1.getName());
		System.out.println( "Salary: "+employee1.getSalary());
		
		System.out.println("After doing some changes....!");
		employee1.name = "asma";
		employee1.salary = 7;
		System.out.println("Name: " + employee1.getName());
		System.out.println( "Salary: "+employee1.getSalary());
		
		
		System.out.println("Creating another object..!by constructor");
		Employee employee2 = new Employee("Sereen", 0.2);
		
		System.out.println("Name: " + employee2.getName());
		System.out.println( "Salary: "+employee2.getSalary());
		
		
		
	}  
	
	
}//end class