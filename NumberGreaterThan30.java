public class NumberGreaterThan30 extends Exception {
	//exceptions typically have the following 3 constructors 
	public NumberGreaterThan30() { // no parameters
	}
	
	public NumberGreaterThan30(String message) { // a specific message
		super(message);
	}
	
	public NumberGreaterThan30(String message, Throwable cause) {
		super(message, cause);
	}
}