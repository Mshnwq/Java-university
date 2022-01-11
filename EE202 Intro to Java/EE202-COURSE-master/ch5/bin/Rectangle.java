
public class Rectangle {

	//instance variable
	private double length, width;
	
	//constructor
	public Rectangle(double length, double width) {
		this.length = (length > 0 ? length : 0);
		this.width = (width > 0 ? width : 0);
	}
	
	//methods
	public double ratio() {
		return length/width;
	}
	
	public boolean isSquare() {
		return (ratio() == 1? true:false);
	}
}
