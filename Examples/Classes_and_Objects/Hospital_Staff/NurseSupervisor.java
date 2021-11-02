


//The nurse in charge of the other nurses (We call the nursing supervisor "Nurse Soup/Supe" for short, weird right? ha!)
public class NurseSupervisor extends Nurse {

	String jobDesc = scopeOfPractice + "Instructs the movement of patients in relation to bed spacing\n";

	public NurseSupervisor(String position, String name, int salary) {
		super(position, name, salary);
	}

	@Override
	void describe() {
		
		// Print out what a Nursing Soup does
		System.out.println(name + " is a " + position + " and makes $" + salary + "/year. Their duties include:\n" + jobDesc + "\n");
	}

}
