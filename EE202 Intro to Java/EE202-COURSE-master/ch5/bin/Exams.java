
public class Exams {

	private String course;
	private double exam1, exam2, exam3;
	
	public Exams() {
		
	}//end constructor
	
	public void setCourseName(String course) {
		this.course = course;
	}
	
	public void setGrades(double exam1, double exam2, double exam3) {
		this.exam1 = exam1;
		this.exam2 = exam2;
		this.exam3 = exam3; 
	}
	
	public double getAverage() {
		return ((exam1+exam2+exam3)/3);
	}
	public double getMax() {
		return (Math.max(exam1, Math.max(exam2, exam3)));
	}
	
	public double getMin() {
		return (Math.min(exam1, Math.min(exam2, exam3)));
	}
	
	public double getGrade1() {
		return exam1;
	}
	
	public double getGrade2() {
		return exam2;
	}
	
	public double getGrade3() {
		return exam3;
	}
	
	public String getCourseName() {
		return course;
	}
	
	
	
}//end class
