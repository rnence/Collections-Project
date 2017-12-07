
public class Spa extends Amenities{
	protected Room unit; 
	
	public static final double COST = 20.00;
	
	public Spa (Room unit) {
		this.unit = unit;
	}
	
	public String getDescription() {
		return unit.getDescription() + " with a spa";
	}
	
	public double cost() {
		return unit.cost() + COST;
	}

}
