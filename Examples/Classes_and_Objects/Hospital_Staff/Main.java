

// Name: Austin C Arledge
// Date: 22 Feb 2021
// Notes: This program is all within one package that I named week4
// Notes:      you should just be able to run the main file "Main" to get started 

public class Main {

	public static void main(String[] args) {
		// Create 1 of every object that we created, then describe their duties
		Doctor Biden = new Attending("Doctor", "Joe Biden", 400000);
		Biden.describe();
		
		Doctor Harris = new Resident("Doctor", "Kamala Harris", 230700);
		Harris.describe();
		
		Doctor Pelosi = new Intern("Doctor", "Nancy Pelosi", 223500);
		Pelosi.describe();
		
		Nurse Leahy = new NurseSupervisor("Nurse", "Patrick Leahy", 193400);
		Leahy.describe();
		
		Nurse Blinken = new RN("Nurse", "Anthony Blinken", 193400);
		Blinken.describe();
		
		Nurse Yellen = new LPN("Nurse", "Janet Yellen", 174000);
		Yellen.describe();
	}

}
