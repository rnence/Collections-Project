/**
 * Tri Nguyen, Mancia Pham, Julian Tran
 * December 12, 2017
 * Purpose: Subject class for Observer design pattern
 *          that represents the wait list for the motel
 * Inputs: none
 * Outputs: none
 */
public class RoomFactory{
	 /** Creates a room with a number of days  and some amenities if any
	  * 
	  * @param d days the roach colony plans to stay
	  * @param Amenities the list of amenites the colony wants
	  * @return the colony's motel room
	  */
	 public Room createRoom(int d, String Amenities) {
		 Room r = new BasicRoom(d);
		 if(Amenities.contains("AutoFillFood")){
			 r = new AutoFillFood(d, r);
		 }
		 if(Amenities.contains("FoodBar")){
			 r = new FoodBar(d, r);
		 }
		 if(Amenities.contains("Spa")){
			 r = new Spa(d, r);
		 }
		 if(Amenities.contains("SprayResistantShower")){
			 r = new SprayResistantShower(d, r);
		 }
		 return r;
	 }
}
