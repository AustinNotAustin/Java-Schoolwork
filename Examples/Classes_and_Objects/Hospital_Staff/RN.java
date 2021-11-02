


// A registered nurse
public class RN extends Nurse {

	String jobDesc = scopeOfPractice + "Acts as the primary nurse for individual patients\n";
	
	// Constructor
	public RN(String position, String name, int salary) {
		super(position, name, salary);
	}

	@Override
	void describe() {
		
		// Print out what an RN does
		System.out.println(name + " is a " + position + " and makes $" + salary + "/year. Their duties include:\n" + jobDesc + "\n");
	}

}
