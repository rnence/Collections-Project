
public class Spa extends Amenities{
	protected Room unit; 
	
	public static final double COST = 20.00;
	
	public Spa (Room unit) {
		description = "Spa";
		this.unit = unit;
	}
	
	public String getDescription() {
		return unit.getDescription() + " + Spa";
	}
	
	public double cost() {
		return unit.cost() + COST;
	}

}
