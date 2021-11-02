


// Boss of the intern doctors
public class Resident extends Doctor{

	String jobDesc = scopeOfPractice + "Follows an attending, and learns to instruct an intern doctor\n";
	
	// Constructor
	public Resident(String position, String name, int salary) {
		super(position, name, salary);
	}

	@Override
	void describe() {
		
		// Print out what a resident does
		System.out.println(name + " is a " + position + " and makes $" + salary + "/year. Their duties include:\n" + jobDesc + "\n");
	}

}
