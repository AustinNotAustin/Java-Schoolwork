


//Abstract class to represent a Staff member who is also a Nurse
public abstract class Nurse extends HospitalStaff {

	String scopeOfPractice = "Assess and evaluate patients' needs for, and responses to, care rendered\r\n"
			+ "Apply sound nursing judgment in patient care management decisions\r\n"
			+ "Provide primary and emergency care for occupational and non-occupational injuries and illnesses\r\n"
			+ "Administer over-the-counter and prescription medications as ordered\r\n"
			+ "Collaborate with the nursing team to create a Plan of Care for all patients\r\n"
			+ "Direct and guide ancillary personnel and maintain standards of professional nursing\n";
	
	// Constructor
	public Nurse(String position, String name, int salary) {
		super(position, name, salary);
	}
}
