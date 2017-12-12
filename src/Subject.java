/**
 * Tri Nguyen, Mancia Pham, Julian Tran
 * December 12, 2017
 * Purpose: Subject class for Observer design pattern
 *          that represents the wait list for the motel
 * Inputs: none
 * Outputs: none
 */
import java.util.ArrayList;
import java.util.List;

public class Subject {
	/* Array List of Observers */
	private List<Observer> observers = new ArrayList<Observer>();
	/* the boolean state that represents the vacancy of the motel */
	private Boolean state; 
	/** Returns the state of the subject
	 * @return the state
	 */
	public Boolean getState() {
		return state;
	}
	/** Changes the state (true = vacant, false = no vacany)
	 *  notifies observers when true or vacant
	 * @param state the state of the subject (vacancy/no vacancy)
	 */
	public void setState(Boolean state) {
		this.state = state;
		if (state) {
			notifyAllObservers();			
		}
	}	
	/** Adds a roach colony to the wait list 
	 * @param observer the observer of the subject (roach colony)
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}
	/** Notifies the observers on the wait list
	 */
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
