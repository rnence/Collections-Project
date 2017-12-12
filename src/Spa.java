
public class Spa extends Amenities{
	protected Room unit; 
	
	/** Cost of the Spa Amenity*/
	public static final double COST = 20.00;
	
	/**Constructor for Making the Spa to decorate room
	 * @param d Number of days stayed
	 * @param unit Room to be decorated with Amenity
	 */
	public Spa (int d, Room unit) {
		description = "Spa";
		days_stayed = d;
		this.unit = unit;
	}
	
	/**@return Room description with Amenity */
	public String getDescription() {
		return unit.getDescription() + " + Spa";
	}
	
	/**@reutrn The cost of the Amenity */
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
