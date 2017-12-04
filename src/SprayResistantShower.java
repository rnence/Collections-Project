
public class SprayResistantShower {
	protected Room unit; 
	
	public static final double COST = 25.00;
	
	public SprayResistantShower (Room unit) {
		this.unit = unit;
	}
	
	public String getDescription() {
		return unit.getDescription() + " with a spray resistant shower";
	}
	
	public double cost() {
		return unit.cost() + COST;
	}

}
