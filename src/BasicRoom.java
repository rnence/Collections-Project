// a concrete instance of a room
public class BasicRoom extends Room {
	public static final double COST = 50.00;
	
	public BasicRoom() {
		description = "Basic Room";
	}
	
	public double cost() {
		return COST;
	}
	
}
