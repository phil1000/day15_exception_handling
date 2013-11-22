import java.util.List;
import java.util.ArrayList;

public class PrimeDivisorList {

	private ArrayList<Integer> integerList;
	
	public PrimeDivisorList() {
		integerList = new ArrayList<Integer>();
	}
	
	public void launch() {	
		this.populateList();
		this.printList();
	}
	
	public void populateList() {
		Integer[] inputNumbers = {2,3,5,7,11,null,13,17,18,23,31,29};
		for (int i=0;i<inputNumbers.length;i++) {
			try {
				this.checkPrime(inputNumbers[i].intValue()); // this also check usage of my own exception message
				integerList.add(inputNumbers[i]);
			} catch (NullPointerException ex) {
				System.out.println("Null number ignored");
			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			} catch (NumberGreaterThan30 ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	
	public void checkPrime(int number) throws IllegalArgumentException, NumberGreaterThan30 {
	
		for (int i=2;i<number;i++) {
			if (number%i==0) throw new IllegalArgumentException(number + " is not a prime so ignored");
			if (number>30) throw new NumberGreaterThan30(number + " is greater than 30 so randomly ignored");
		}
	}
	
	public void printList() {
		for (Integer i : integerList) {
			System.out.print(i.toString()+",");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		PrimeDivisorList listScript = new PrimeDivisorList();
		listScript.launch();
	}
}