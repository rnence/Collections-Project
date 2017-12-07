
public class Motel {

	private static Motel instance;
	private int capacity;
	private Boolean vacancy;
	
	private Motel(){
		setCapacity(25);
	};
	
	// declare the constructor as private which prevents object creation via new
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

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
