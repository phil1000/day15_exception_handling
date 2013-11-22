public class UserInputErrorScript {

	public void launch() {
		
		int[] numbers = getNumbers();
		
		if (numbers!=null) {
			double mean = getMean(numbers);
			System.out.println("mean ="+ mean);
		}
	}
	
	public void printList(int[] numbers) {
		for (int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+":");
		}
		System.out.println("");
	}
	
	public int[] getNumbers() {
		int[] numberlist = null;
		int numberCount=0;
		
		System.out.println("please enter 10 integers, one at a time ");
		System.out.println("i.e. key in a number, then press enter");
		System.out.println("please key in first number");
		
		numberlist = new int[10];
		while (numberCount<10) {
			try {
				int number = Integer.parseInt(System.console().readLine());
				numberlist[numberCount] = number;
				numberCount++;
				System.out.println("now key in the next number");
			} catch (NumberFormatException ex) {
				System.out.println("invalid number value, please re-enter a valid number");
			}
		}	
		return numberlist;
	}
	
	public double getMean(int[] numbers) {
		double total = 0;
		double mean = 0;
		
		for (int i=0;i<numbers.length;i++) {
			total=total+numbers[i];
		}
		mean = total/numbers.length;
		return mean;
	}
	
	public static void main(String[] args) {
		UserInputErrorScript UIscript = new UserInputErrorScript();
		UIscript.launch();
	}
}