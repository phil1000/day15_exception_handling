public class Hospital {

	private Patient[] patientList = new Patient[10];
	
	public void launch() {
		int patientCount = this.addPatients();
		this.printPatients(patientCount);
	}
	
	public int addPatients() {
		String[][] myPatients = { {"A","1960"},{"B","1999"},{"C","-1"},{"D","1850"},{"E","2001"}};
		int patientCount=0;
		
		for (int i=0; i<myPatients.length;i++) {
			try {
				Patient newPatient = new Patient(myPatients[i][0], Integer.parseInt(myPatients[i][1]));
				patientList[patientCount]=newPatient;
				patientCount++;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			}
		}
		return patientCount;
	}
	
	public void printPatients(int patientCount) {
		for (int i=0;i<patientCount;i++) {
			patientList[i].print();
		}
	}
	
	public static void main(String[] args) {
		Hospital myHospital = new Hospital();
		myHospital.launch();
	}
}