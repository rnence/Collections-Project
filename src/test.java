
public class test {

	public static void main(String[] args) {
		// Create Roach Motel
		Motel roach_motel = Motel.getInstance();
		
		System.out.println(roach_motel);
		System.out.println("Capacity: " + roach_motel.getCapacity());
		
		// Check in some roaches
		RoachColony roach1 = new RoachColony("Tri's Roaches", 100, 3);
		RoachColony roach2 = new RoachColony("Julian's Roaches", 500, 4);
		RoachColony roach3 = new RoachColony("Ryan's Roaches", 15, 10);
		RoachColony roach4 = new RoachColony("Julio's Roaches", 50, 6);
		RoachColony roach5 = new RoachColony("Mancia's Roaches", 99, 2);
		RoachColony roach6 = new RoachColony("Catherine's Roaches", 800, 5);
		
		roach_motel.checkIn(roach1, "Spa FoodBar", 3);
		System.out.println(roach_motel);
		roach_motel.checkIn(roach2, "FoodBar AutoFillFood", 5);
		System.out.println(roach_motel);
		roach_motel.checkIn(roach3, "SprayResistantShower", 4);
		System.out.println(roach_motel);
		roach_motel.checkIn(roach4, "none", 7);
		System.out.println(roach_motel);
		roach_motel.checkIn(roach5, "Spa FoodBar AutoFillFood", 6);
		System.out.println(roach_motel);
		roach_motel.checkIn(roach6, "Spa FoodBar SprayResistantShower", 10);
				
		roach_motel.checkOut(roach3);
		
		System.out.println(roach5);
		roach5.throwParty();
		roach5.gotSprayed();
		
		
		
	

	}

}
