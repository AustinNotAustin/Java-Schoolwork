


//Abstract class to represent a Staff member who is also a Doctor
public abstract class Doctor extends HospitalStaff {

	String scopeOfPractice = "Conducting routine check-ups to patients to assess their health condition and discover possible issues\r\n"
			+ "Giving appropriate advice for healthy habits (diet, hygiene etc.) and preventative actions to promote overall health\r\n"
			+ "Conducting examinations to ill patients and evaluate symptoms to determine their condition\n";
	
	
	// Constructor
	public Doctor(String position, String name, int salary) {
		super(position, name, salary);
	}

}
