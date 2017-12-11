
public class FoodBar extends Amenities {
	protected Room unit; 
	
	public static final double COST = 10.00;
	
	public FoodBar (Room unit) {
		description = "FoodBar";
		this.unit = unit;
	}
	
	public String getDescription() {
		return unit.getDescription() + " + Food Bar";
	}
	
	public double cost() {
		return unit.cost() + COST;
	}

}
