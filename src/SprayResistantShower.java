
public class SprayResistantShower extends Amenities{
	protected Room unit; 
	
	public static final double COST = 25.00;
	
	public SprayResistantShower (Room unit) {
		description = "SprayResistantShower";
		this.unit = unit;
	}
	
	public String getDescription() {
		return unit.getDescription() + " + Spray Resistant Shower";
	}
	
	public double cost() {
		return unit.cost() + COST;
	}

}
