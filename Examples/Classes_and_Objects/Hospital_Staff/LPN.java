


//A licensed practical nurse
public class LPN extends Nurse {

	String jobDesc = scopeOfPractice + "Works under an RN as the secondary nurse for patients\n";

	public LPN(String position, String name, int salary) {
		super(position, name, salary);
	}

	@Override
	void describe() {
		
		// Print out what an LPN does
		System.out.println(name + " is a " + position + " and makes $" + salary + "/year. Their duties include:\n" + jobDesc + "\n");
	}

}
