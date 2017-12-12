
// a concrete instance of a room
public class BasicRoom extends Room {
	/** Cost of a Basic Room */
	public static final double COST = 50.00;
	
	/**Constructor for making a room
	 * @param d Number of Days Stayed in Room
	 */
	public BasicRoom(int d) {
		description = "Basic Room";
		occupants = null;
		days_stayed = d;
	}
	
	/**@return the Cost of room	 */
	public double cost() {
		return COST;
	}
	
	/**@return days_stayed */
	public int days() {
		return days_stayed;
	}
	
	/** Sets the Room Number */
	public void setRoomNumber(int rn) {
		room_number = rn;
	}
	
	/** Sets the number of Occupants in Room */
	public void setOccupants(RoachColony rc) {
		occupants = rc;
	}
	
	/** Clears out room when checking out */
	public void clear() {
		description = "Basic Room";
		occupants = null;
		days_stayed = 0;
	}
	
}
