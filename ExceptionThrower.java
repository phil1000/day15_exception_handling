public class ExceptionThrower {

	public void launch() {
		System.out.println("Enter a number");
		int n = getNumber();
		if (n!=0) {
			String isOdd = ( n%2 == 0 ) ? "even" : "odd";
			System.out.println("You entered: " + n + " which is: " + isOdd);
		}
	}
	
	public int getNumber() {
		int result=0; //default value
		try {
			String str = System.console().readLine();
			result = Integer.parseInt(str);
		} catch (NumberFormatException ex) {
			System.out.println("Enter an integer McFly");
		}
		return result;
	}
	
	public static void main(String[] args) {
		ExceptionThrower et = new ExceptionThrower();
		et.launch();
	}
}