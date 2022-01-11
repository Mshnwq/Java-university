public class StudentTest{
	public static void main(String[] args){
		//creat object
		Student student1 = new Student("Abdullah", "Al-Shuaibi", 100, 90, 77.9);
		
		System.out.printf("Hello %s %s, your avg grade is: %.1f.\n", student1.getFirstName(), student1.getLastName(),student1.getAverage());
		
		student1.setFirstGrade(90);
		student1.setSecondGrade(90);
		student1.setThirdGrade(90);
		
		System.out.printf("%s %s, your new grade is: %.1f.\n", student1.getFirstName(), student1.getLastName(),student1.getAverage() );
		
	}//end main
	
	
}//end class