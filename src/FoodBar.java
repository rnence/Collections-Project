
public class FoodBar extends Amenities {
	protected Room unit; 
	
	public static final double COST = 10.00;
	
	public FoodBar (int d, Room unit) {
		description = "FoodBar";
		days_stayed = d;
		this.unit = unit;
	}
	
	public String getDescription() {
		return unit.getDescription() + " + Food Bar";
	}
	
	public double cost() {
		return unit.cost() + COST;
	}

	@Override
	public int days() {
		return days_stayed;
	}

	@Override
	public void setRoomNumber(int rn) {
		room_number = rn;
		
	}

	@Override
	public void setOccupants(RoachColony rc) {
		occupants = rc;
		
	}


	@Override
	public void clear() {
		description = "Basic Room";
		occupants = null;
		days_stayed = 0;
	}

}
