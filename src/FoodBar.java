
public class FoodBar extends Amenities {
	protected Room unit; 
	
	public static final double COST = 10.00;
	
	public FoodBar (Room unit) {
		this.unit = unit;
	}
	
	public String getDescription() {
		return unit.getDescription() + " with a food bar";
	}
	
	public double cost() {
		return unit.cost() + COST;
	}

}
