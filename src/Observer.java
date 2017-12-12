/**
 * Tri Nguyen, Mancia Pham, Julian Tran
 * December 12, 2017
 * Purpose: Abstract Observer class for Observer design pattern
 * Inputs: none
 * Outputs: none
 */
public abstract class Observer {
	/* The subject that the observer is observing */
	protected Subject subject;
	/** The abstract function for update the subject.
	 */
	public abstract void update();
}
