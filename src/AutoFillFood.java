
public class AutoFillFood {
	protected Room unit; 
	
	public static final double COST = 05.00;
	
	public AutoFillFood (Room unit) {
		this.unit = unit;
	}
	
	public String getDescription() {
		return unit.getDescription() + " with an auto refill food bar";
	}
	
	public double cost() {
		return unit.cost() + COST;
	}

}
