


//An assistant to the nurses
public class Attending extends Doctor {

	String jobDesc = scopeOfPractice + "Providing guidance and education to student Doctors\n";
	
	// Constructor
	public Attending(String position, String name, int salary) {
		super(position, name, salary);
		
	}

	@Override
	void describe() {
		
		// Print out what an attending does
		System.out.println(name + " is a " + position + " and makes $" + salary + "/year. Their duties include:\n" + jobDesc + "\n");
	}

	
	
}
