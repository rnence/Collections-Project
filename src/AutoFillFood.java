
public class AutoFillFood extends Amenities{
	protected Room unit; 
	
	public static final double COST = 05.00;
	
	public AutoFillFood (Room unit) {
		description = "AutoFillFood";
		this.unit = unit;
	}
	
	public String getDescription() {
		return unit.getDescription() + " + Auto Food Refill";
	}
	
	public double cost() {
		return unit.cost() + COST;
	}

}
