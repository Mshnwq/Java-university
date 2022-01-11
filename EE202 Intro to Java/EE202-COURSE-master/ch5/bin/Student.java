
public class Student {

	private int id;
	private String dob;
	public String name;
	
	public Student() {
		
	}
	public Student(int id, String name, String dob) {
		setId(id);
		setName(name);
		setDOB(dob);
	}
	
	//setters
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDOB(String dob) {
		this.dob = dob;
	}
	
	//getters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDOB() {
		return dob;
	}
	
	//toString() method
	
	public String toString() {
		return "Name: " + name + "\nId: " + id + "\nDate of Birth: " + dob + "\n";
	}
}//end student class
