/**
 * Tri Nguyen, Mancia Pham, Julian Tran
 * December 12, 2017
 * Purpose: Subject class for Observer design pattern
 *          that represents the wait list for the motel
 * Inputs: none
 * Outputs: none
 */
import java.util.ArrayList;

public class Motel {

	private static Motel instance;
	private RoomFactory factory = new RoomFactory();
	private ArrayList<Room> rooms; // the rooms
	private String vacancySign; // the vacancy sign
	private Subject waitlist = new Subject(); // the waitlist
	private int roomsOccupied;
	private int capacity;
	/** Creates a new roach motel
	 */
	private Motel() {
		rooms = new ArrayList<Room>();
		vacancySign = "VACANCY";
		capacity = 5;
	}
	/** Ensure a single instance (Singleton Pattern)
	 * @return the instance of the motel
	 */
	public synchronized static Motel getInstance() {
	     if (instance == null) {
	       instance = new Motel();
	       System.out.println("Instance Created");
	     }
	     return instance;
	}
	/** Returns the capacity of the motel 
	 * @return capacity of motel
	 */
	public int getCapacity() {		
		return capacity;
	}
	/** Returns the vacancy status of the motel 
	 * @return VACANCY/ NO VACANCY
	 */
	public String getVacancy() {		
		return vacancySign;
	}
	/** Sets the Vacancy status depending on whether the number of rooms occupied
	 *  has reached capacity  
	 */
	public void checkVacancy() {
		if(roomsOccupied < capacity) {
			vacancySign = "VACANCY";
		} else {
			vacancySign = "NO VACANCY";
		}
	}
	/** Checks in a Colony to a room with the number of days they are staying
	 *  and the amenities that they want. If the motel is full, it puts them
	 *  on a wait list 
	 * @param roaches the colony
	 * @param amenities the amenities they want
	 * @param d the number of days they are staying
	 */
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
	/** Checks out a colony after their stay.
	 *  Calculates their bill, clears the room, and notifies the colonys on the waitlist
	 *  about the new vacancy
	 * @param rc the colony
	 */
	public void checkOut( RoachColony rc ) {
		double bill = rc.getRoom().cost() * rc.getRoom().days();
		System.out.println(rc + " was charged $" + bill + " for their stay.");
		rc.getRoom().clear();
		roomsOccupied--;
		waitlist.notifyAllObservers();
	}
	/** The overrided to string for print the motel
	 */
	@Override
	public String toString() {
		checkVacancy();
		return "Roach Motel\n" + vacancySign;
	}
}
