
public class FoodBar extends Amenities {
	protected Room unit; 
	
	/** Cost of the FoodBar Amenity */
	public static final double COST = 10.00;
	
	/**Constructor for creating the FoodBar Amenity to decorate room
	 * @param d Number of Days stayed in room
	 * @param unit Room to be decorated with Amenity
	 */
	public FoodBar (int d, Room unit) {
		description = "FoodBar";
		days_stayed = d;
		this.unit = unit;
	}
	
	/** @return Room description with Amenity */
	public String getDescription() {
		return unit.getDescription() + " + Food Bar";
	}
	
	/** @return cost of the Amenity */
	public double cost() {
		return unit.cost() + COST;
	}

	/**@return days_stayed */
	@Override
	public int days() {
		return days_stayed;
	}

	/** Sets the room number */
	@Override
	public void setRoomNumber(int rn) {
		room_number = rn;
	}

	/** Sets the Occupants of the room */
	@Override
	public void setOccupants(RoachColony rc) {
		occupants = rc;
	}

	/** Clears the room when checking out */
	@Override
	public void clear() {
		description = "Basic Room";
		occupants = null;
		days_stayed = 0;
	}

}
