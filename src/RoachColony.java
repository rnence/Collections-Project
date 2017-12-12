// roaches
public class RoachColony extends Observer {
	
	private String name;
	private int population;
	private double growthRate;
	private Room room = new BasicRoom(0);
	
	public RoachColony(String n, int p, double g) {
		name = n;
		population = p;
		growthRate = g;		
	}
	
	public void assignRoom(Room r) {
		room = r;
	}
	
	public Room getRoom() {
		return room;
	}
	

	public void throwParty() {
		System.out.println(name + " threw a party!");
		population = population + (int) (population * growthRate);
		System.out.println(name + "'s population is now " + population);
	}
	
	public void gotSprayed() {
		System.out.println(name + " got sprayed!");
		if(room.getDescription().contains("SprayResistantShower")) {
			population = (int) (population * 0.75);
		} else {
			population = (int) (population * 0.50);
		}
		System.out.println(name + "'s population is now " + population);
	}
	
	@Override
	public void update() {
		System.out.println( "Notified Colony " + name );
	}
	
	@Override
	public String toString() {
		return name + ": " + population + " roaches";
	}

}
