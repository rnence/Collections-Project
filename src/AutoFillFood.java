
public class AutoFillFood extends Amenities{
	protected Room unit; 
	
	/** The cost of the Amenity */
	public static final double COST = 05.00;
	
	/** Constructor for creating the Amenity to decorate room
	 * @param d Number of Days Stayed
	 * @param unit Room to be decorated with Amenity
	 */
	public AutoFillFood (int d, Room unit) {
		description = "AutoFillFood";
		days_stayed = d;
		this.unit = unit;
	}
	
	/**Returns room Description
	 * @return room's description as well as amenities
	 */
	public String getDescription() {
		return unit.getDescription() + " + Auto Food Refill";
	}
	
	/**Returns the cost
	 * @return Cost of the Amenity
	 */
	public double cost() {
		return unit.cost() + COST;
	}

	/**@return days_stayed */
	@Override
	public int days() {
		return days_stayed;
	}
	
	/** Sets the Room number */
	@Override
	public void setRoomNumber(int rn) {
		room_number = rn;
		
	}

	/** Sets number of Occupants */
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
