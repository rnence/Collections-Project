import java.util.ArrayList;
import java.util.List;

// basically waitlist class
public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private Boolean state; //vacancy
	
	public Boolean getState() {
		return state;
	}
	
	//when vacant or not, update state
	public void setState(Boolean state) {
		this.state = state;
		if (state) {
			notifyAllObservers();			
		}
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
