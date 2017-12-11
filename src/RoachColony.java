// roaches
public class RoachColony extends Observer {
	
	private Subject waitlist;
	private String name;
	private int population;
	private double growthRate;
	
	public RoachColony(String n, int p, double g) {
		name = n;
		population = p;
		growthRate = g;
		
	}
	
	// add roach to waitlist
	public void waitlist(Subject subject) {
		this.subject = subject;
	    this.subject.attach(this);
	}
	
	public void throwParty() {
		population = population + (int) (population * growthRate);
	}
	
	@Override
	public void update() {
		System.out.println( "Notified Colony " + name );
	}

}
