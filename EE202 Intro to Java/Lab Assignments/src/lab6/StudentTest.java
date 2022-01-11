package lab6;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("Hayan","Al-Machnouk", 95.5, 98.5, 94.5);
		System.out.printf("Hello %s %s, Your Avg garde is: %.1f.%n",
				student1.getFirstName(),student1.getLastName(),student1.getAverage());
		
		student1.setExamGrade1(97);
		student1.setExamGrade2(100);
		student1.setExamGrade3(95);
		
		System.out.printf("%s %s, Your new Avg garde is: %.1f.%n",
				student1.getFirstName(),student1.getLastName(),student1.getAverage());
	}
}