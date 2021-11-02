


// Abstract class to represent an employee
public abstract class HospitalStaff {

	String position;
    String name;
    int salary;
    
    // Constructor
    public HospitalStaff(String position, String name, int salary) {
    	
    	this.position = position;
    	this.name = name;
    	this.salary = salary;
    }
    
    // Abstract describe method
    abstract void describe();
	
}
