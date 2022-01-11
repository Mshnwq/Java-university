package practiceQuizCh3Package;

public class PetrolPurchase {

	//5-instance var!
	private String stationLocation;
	private String typePetrol;
	private int quantity;
	private double price;
	private double percentageDiscount;
	
	
	public PetrolPurchase(String stationLocation,String typePetrol, int quantity , double price, double percentageDiscount) {
	
		this.stationLocation = stationLocation;
		this.typePetrol = typePetrol;
		this.quantity = quantity;
		this.price = price;
		this.percentageDiscount = percentageDiscount;
	}
	
	
	public double getPurchaseAmount() {
		return (quantity * price) -percentageDiscount;
	}
}
