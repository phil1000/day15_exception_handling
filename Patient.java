public class Patient {
	private String name;
	private int birthYear;
	
	public Patient(String name, int birthYear) throws IllegalArgumentException {		
		try {
			this.setAge(birthYear);
		} catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
		this.setName(name);
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int birthYear) throws IllegalArgumentException {
		if ((birthYear<0) || ((2013-birthYear)>130)) {
			throw new IllegalArgumentException("age of patient either negative or greater than 130:" + Integer.toString(birthYear));
		} else {
			this.birthYear=birthYear;
		}
	}
	
	public void print() {
		System.out.println("Name:"+this.name+" birthYear:"+this.birthYear);
	}
}
