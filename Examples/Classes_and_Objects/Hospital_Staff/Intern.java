


// Technically a doctor, but the nurses usually tell this doc how to doc, also is the boss of nobody :(
public class Intern extends Doctor{

	String jobDesc = scopeOfPractice + "Follows an attending, a resident, and sometimes an experienced nurse\n";
	
	public Intern(String position, String name, int salary) {
		super(position, name, salary);
	}

	@Override
	void describe() {
		
		// Print out what an intern does
		System.out.println(name + " is a " + position + " and makes $" + salary + "/year. Their duties include:\n" + jobDesc + "\n");
	}

}
