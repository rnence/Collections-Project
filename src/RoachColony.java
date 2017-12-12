/**
 * Tri Nguyen, Mancia Pham, Julian Tran
 * December 12, 2017
 * Purpose: This class represents a Roach Colony that checks in/out of the Roach Motel.
 * 				It extends the observer class and observes the waitlist Subject.
 * Inputs: name, population, growth rate, room
 * Outputs: Roach colony, colony's room
 */
public class RoachColony extends Observer {
	/* The name of the colony */
	private String name;
	/* The population of the colony */
	private int population;
	/* The rate that the colony grows */
	private double growthRate;
	/* The room that the colony checks into */
	private Room room = new BasicRoom(0);
	/** Constructs a Roach Colony.
	 * @param n the colony's name
	 * @param p the colony's population
	 * @param g the colony's growth rate
	 */
	public RoachColony(String n, int p, double g) {
		name = n;
		population = p;
		growthRate = g;		
	}
	/** Assigns a room to the colony when they check in to the motel
	 * @param r the colony's room
	 */
	public void assignRoom(Room r) {
		room = r;
	}
	/** Returns the room of the colony	 * 
	 * @return the colony's room
	 */
	public Room getRoom() {
		return room;
	}
	/** This function throws a Roach Party that increases the Roach Colony's Population 
	 *  by its growth factor. (population += population * growthrate)
	 */
	public void throwParty() {
		System.out.println(name + " threw a party!");
		population = population + (int) (population * growthRate);
		System.out.println(name + "'s population is now " + population);
	}
	/** This function sprays a Roach Colony after they have thrown a party
	 *  and decreases their population by 25% if they have a Spray Resistant 
	 *  Shower and by 50% otherwise.
	 */
	public void gotSprayed() {
		System.out.println(name + " got sprayed!");
		if(room.getDescription().contains("SprayResistantShower")) {
			population = (int) (population * 0.75);
		} else {
			population = (int) (population * 0.50);
		}
		System.out.println(name + "'s population is now " + population);
	}
	/** This function notifies the colonies on the waitlist whenever a room becomes available. 
	 */
	@Override
	public void update() {
		System.out.println( "Notified Colony " + name );
	}
	/** Overrides toString to print the Roach Colony
	 */
	@Override
	public String toString() {
		return name + ": " + population + " roaches";
	}

}
