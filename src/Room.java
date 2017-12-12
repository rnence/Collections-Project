// component room to be decorated with amenities
// also the product the factory constructs
public abstract class Room {
	protected String description;
	protected RoachColony occupants;
	protected int days_stayed;
	protected int room_number;
	
	// returns the description of the room
	public String getDescription() {
		return "Room " + room_number + ": " + description;
	}
	
	// returns the cost of the room
	public abstract double cost();
	
	// returns the number of days stayed in room
	public abstract int days();
	
	public abstract void setRoomNumber(int rn);
	
	// puts the roaches into a room
	public abstract void setOccupants(RoachColony rc);

	// clears the room
	public abstract void clear();

}
