
public class RoomFactory{
	 	
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
