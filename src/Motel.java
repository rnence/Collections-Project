
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Motel implements Map {

	private static Motel instance;
	private int maxCapacity;
	private HashMap Rooms = new HashMap();
	private int roomsOccupied;
	private String vacancySign;
	
	Motel(){
		setCapacity(25);
		
		roomsOccupied = 0;
		vacancySign = "VACANCY";
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
		return maxCapacity;
	}

	public void setCapacity(int capacity) {
		this.maxCapacity = capacity;
	}
	
	public String getVacancy() {		
		return vacancySign;
	}

	public void checkVacancy() {
		if(roomsOccupied < maxCapacity) {
			vacancySign = "VACANCY";
		} else {
			vacancySign = "NO VACANCY";
		}
	}
	
	public void checkIn( RoachColony roaches ) {
		if(vacancySign.equals("VACANCY")) {
			roomsOccupied++;
		} else {
			//put on waitlist
		}	
		
	}
	
	@Override
	public String toString() {
		return "Roach Motel\n" + vacancySign;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}
}
