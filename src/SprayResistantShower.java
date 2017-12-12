
public class SprayResistantShower extends Amenities{
	protected Room unit; 
	
	/** Cost of the Amenity */
	public static final double COST = 25.00;
	
	/** Constructor for creating Spray Resistant Shower to decorate room with
	 * @param d Number of days stayed
	 * @param unit Room to be decorated with Amenity
	 */
	public SprayResistantShower (int d, Room unit) {
		description = "SprayResistantShower";
		days_stayed = d;
		this.unit = unit;
	}
	
	/**@return the description of the room with Amenity */
	public String getDescription() {
		return unit.getDescription() + " + Spray Resistant Shower";
	}
	
	/**@return The cost of Amenity */
	public double cost() {
		return unit.cost() + COST;
	}

	/**@return days_stayed */
	@Override
	public int days() {
		return days_stayed;
	}

	/** Sets the Room Number */
	@Override
	public void setRoomNumber(int rn) {
		room_number = rn;
	}

	/** Sets the Occupants of the room*/
	@Override
	public void setOccupants(RoachColony rc) {
		occupants = rc;
	}

	/**Clears the room when checking out */
	@Override
	public void clear() {
		description = "Basic Room";
		occupants = null;
		days_stayed = 0;
	}

}
