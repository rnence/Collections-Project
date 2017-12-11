
public class test {

	public static void main(String[] args) {
		// Create Roach Motel
		Motel roach_motel = new Motel();
		System.out.println(roach_motel);
		System.out.println("Capacity: " + roach_motel.getCapacity());
		
		
		
		
		Subject waitlist = new Subject();
		RoachColony roach1 = new RoachColony("Tri's Roaches", 100, 3);
		RoachColony roach2 = new RoachColony("Julian's Roaches", 500, 4);
		
		if(roach_motel.getVacancy().equals("VACANCY")) {
			// check in
		} else {
			roach1.waitlist(waitlist);
		}
		
		
		waitlist.setState(roach_motel.getVacancy().equals("VACANCY"));		

		roach2.waitlist(waitlist);
		
		
		waitlist.setState(roach_motel.getVacancy().equals("VACANCY"));	

	}

}
