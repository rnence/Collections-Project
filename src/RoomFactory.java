
public class RoomFactory {
	 
	// something something amenities in an arraylist
	
	/**
	  * Returns a Basic Room.
	  */
	 public Room createRoom(String type) {
		 if (type.equals("Basic Room"))
			 return new BasicRoom();
		 else
			 return null;
	 }

}
