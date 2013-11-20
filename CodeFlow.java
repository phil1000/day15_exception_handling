import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class CodeFlow {

	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		this.createList(intList);
		this.printList(intList);
		try {
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}
	
	public void createList(List<Integer> intList) {
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
	}
	
	public void printList(List<Integer> list) {
		for (Integer it : list) // creates an iterator of type Integer that selects each list item in turn
			System.out.println("Value=" + it.toString());
	}
	
	public static void main(String[] args) {
		CodeFlow et = new CodeFlow();
		if (args.length>0) {
			et.launch(Integer.parseInt(args[0]));
		} else System.out.println("Enter a number");

	}
}