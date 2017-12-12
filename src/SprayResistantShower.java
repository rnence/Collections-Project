
public class SprayResistantShower extends Amenities{
	protected Room unit; 
	
	public static final double COST = 25.00;
	
	public SprayResistantShower (int d, Room unit) {
		description = "SprayResistantShower";
		days_stayed = d;
		this.unit = unit;
	}
	
	public String getDescription() {
		return unit.getDescription() + " + Spray Resistant Shower";
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
