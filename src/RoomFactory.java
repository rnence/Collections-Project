
public class RoomFactory{
	 	
	 public Room createRoom(String Amenities) {
		 Room r = new BasicRoom();
		 if(Amenities.contains("AutoFillFood")){
			 r = new AutoFillFood(r);
		 }
		 if(Amenities.contains("FoodBar")){
			 r = new FoodBar(r);
		 }
		 if(Amenities.contains("Spa")){
			 r = new Spa(r);
		 }
		 if(Amenities.contains("SprayResistantShower")){
			 r = new SprayResistantShower(r);
		 }
		 return r;
	 }
}
