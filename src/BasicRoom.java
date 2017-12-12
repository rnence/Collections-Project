// a concrete instance of a room
public class BasicRoom extends Room {
	public static final double COST = 50.00;
	
	public BasicRoom(int d) {
		description = "Basic Room";
		occupants = null;
		days_stayed = d;
	}
	
	public double cost() {
		return COST;
	}
	
	public int days() {
		return days_stayed;
	}
	
	public void setRoomNumber(int rn) {
		room_number = rn;
	}
	
	public void setOccupants(RoachColony rc) {
		occupants = rc;
	}
		
	public void clear() {
		description = "Basic Room";
		occupants = null;
		days_stayed = 0;
	}
	
}
