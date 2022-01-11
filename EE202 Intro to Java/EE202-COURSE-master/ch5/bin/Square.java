
public class Square {

	private int side;
	private int area;
	
	public Square(int side) {
		this.side = side;
	}
	
	public void setArea() {
		area = side * side;
	}
	
	public String toString() {
		return "Side: "+ side + " Area: " + area;
	}
}
