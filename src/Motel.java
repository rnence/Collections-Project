import java.util.ArrayList;

public class Motel {

	private static Motel instance;
	private RoomFactory factory = new RoomFactory();
	private ArrayList<Room> rooms; // the rooms
	private String vacancySign; // the vacancy sign
	private Subject waitlist = new Subject(); // the waitlist
	private int roomsOccupied;
	private int capacity;
	
	private Motel() {
		rooms = new ArrayList<Room>();
		vacancySign = "VACANCY";
		capacity = 5;
	}
	
	public synchronized static Motel getInstance() {
	     if (instance == null) {
	       instance = new Motel();
	       System.out.println("Instance Created");
	     }
	     return instance;
	}
	
	public int getCapacity() {		
		return capacity;
	}
	
	public String getVacancy() {		
		return vacancySign;
	}

	public void checkVacancy() {
		if(roomsOccupied < capacity) {
			vacancySign = "VACANCY";
		} else {
			vacancySign = "NO VACANCY";
		}
	}

	public void checkIn( RoachColony roaches, String amenities, int d ) {
		checkVacancy();
		if(vacancySign.equals("VACANCY")) {
			roomsOccupied++;
			Room newRoom;
			newRoom = factory.createRoom(d, amenities);
			
			newRoom.setOccupants(roaches);
			rooms.add(newRoom);
			newRoom.setRoomNumber(rooms.indexOf(newRoom)+1);
			roaches.assignRoom(newRoom);
			System.out.println(roaches + " checked into " + newRoom.getDescription() + " for " + d + " days.");
		} else {
			System.out.println("Rooms are full.");
			waitlist.attach(roaches);
			System.out.println( roaches + " was put on the waitlist");
		}	
		
	}
	
	public void checkOut( RoachColony rc ) {
		double bill = rc.getRoom().cost() * rc.getRoom().days();
		System.out.println(rc + " was charged $" + bill + " for their stay.");
		rc.getRoom().clear();
		roomsOccupied--;
		waitlist.notifyAllObservers();
	}
	
	@Override
	public String toString() {
		checkVacancy();
		return "Roach Motel\n" + vacancySign;
	}

}
