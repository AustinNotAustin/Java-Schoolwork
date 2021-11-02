package week6;

// Name: Austin C Arledge
// Date: 12 Mar 2021
// Desc: A calculator that tells you how many years ago or in the future a date is.
// Info: Run the class in cmd at the same directory with "java Main"

import java.util.Scanner;


public class Main {
	
	
	static String askCont = "Enter yes to continue, enter anything else to exit: ";

	
	public static void main(String args[]) {
		
		boolean run = true;
		
		do {
			// Creating a new scanner
			Scanner scanner = new Scanner(System.in);
			
			// Prompt the user
			System.out.println("\n\n\nThis application tells you how long ago an entered year was\n");
			System.out.println("Please enter a year in numeric format: ");
			
			// Receive the input
			String date = scanner.next();
			
			// Calculate the date
			ageCalc(date);

			// Ask the user if they want to continue
			System.out.println(askCont);
			String cont = scanner.next();
			//System.out.println("You just entered \"" + String.valueOf(cont) + "\", is it == to \"yes\"? " + (cont.equals("yes")));
			
			// If they want to continue, call the main method again
			if (!(cont.equals("yes"))) {
				System.out.println("\n\n\nEnding the program...\nGoodbye\n\n\n");
				run = false;
			}
			
		} while (run);
	}
	
	
	// Determines the difference in years
	static void ageCalc(String input) {
		int yearDiff;
		int x;
		int currentYear = 2021;
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			x = Integer.valueOf(input);
			yearDiff = x - currentYear;
			
			// Print the difference in years
			if (yearDiff == 0) {
				System.out.println("\n\n\nThere is no difference in the year, try again?");
			}
			
			if (yearDiff > 0) {
				System.out.println("\n\n\nThat date is " + yearDiff + " year(s) in the future");
			}
			
			if (yearDiff < 0) {
				System.out.println("\n\n\nThat date is " + Math.abs(yearDiff) + " year(s) in the past");
			}
		} catch (Exception e) {
			
			System.out.println("\n\n\nPlease enter a number in numeric format, ex: 2000, 1500, 250, 2090");
		} finally {
			
			System.out.println("You entered: " + input + "\n");
		}
	}
}
