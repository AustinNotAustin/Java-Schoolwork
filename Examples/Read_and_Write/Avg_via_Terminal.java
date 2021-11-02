


import java.util.ArrayList;
import java.util.Scanner;

// Austin C Arledge
// 23 Mar 21

// Notes: This program accepts numbers from the end user and averages it. It can also optionally save the results to a CSV.
// RUN: To run, open cmd in the same dir as this file, run it with "java Main". The prompts should guide you frome there.

public class Main {
	
	static ArrayList<Integer> numList = new ArrayList<Integer>();

	// Create a new scanner
	static Scanner scanner = new Scanner(System.in);
	
	
	// Main method
	public static void main(String[] args) {
		
		greetUser();
		getNums();
	} 
	
	
	// Method to get the user's name and greet them
	static void greetUser() {
		
		// Get the user's name
		System.out.print("Hey! What's your name?\n> ");
		String name = scanner.next();
		
		// Greet the user
		System.out.println("\nHey there, " + name + "!\n");
	}
	
	
	// Method to get the user's numbers & display the results
	static void getNums() {
		
		Boolean run = true;
		String prompt = "\nEnter a number or type STOP to quit\n> ";
		
		// Ask the user to enter their numbers
		System.out.println("Enter as many numbers as you want, and I'll average them.");
		System.out.println("Enter STOP and press RETURN to end the number collection.");
		System.out.println("Be sure to enter numbers: '29' and not letters: 'Twenty Nine'.");
		
		// Run this loop while the run bool is True
		do {
			
			System.out.print(prompt);
			String strInput = scanner.next();
			
			
			// If the user enters 'stop', the loop ends
			if (strInput.toLowerCase().equals("stop")) {
				System.out.print("\nStopping number collection...\n\n");
				run = false;
				break;
			}
			
			// Check to ensure the data entered is correct
			try {
				
				int intInput = Integer.valueOf(strInput);
				numList.add(intInput);
			
				
			// Inform the user if they enter bad data
			} catch(Exception e) {
				
				System.out.print("\n\n- - - - ERROR - - - -\nThat was an invalid entry!\n\n");
				
			}
			
		} while (run);
		
		
		if (numList.size() > 0) {
			
			FileManager.intArrToStr(numList);
			askToSave();
			askToReview();
		}
	}
	
	
	// Ask the user is they want to save
	static void askToSave() {
		
		// Ask the user if they want to save
		System.out.println("\n\nWould you like to save the results?");
		System.out.print("Please enter YES or NO\n> ");
		
		// Get the answer
		String ans = scanner.next();
		
		// Convert the answer to lower case
		ans = ans.toLowerCase();
		Character ansIndex;
		
		try {
			
			// Check if the lower case character is y or n
			ansIndex = ans.charAt(0);
			if (ansIndex == 'y') {
				
				// Save the information
				FileManager.saveFile(numList);
				
				System.out.println("\n\nFile saved!\n");
			}
			
			if (ansIndex == 'n') {
				
				System.out.println("\n\nNot saving!\nApplication is now ending...\n\n\nGoodbye!\n");
				System.exit(0);
			}
			
		} catch (Exception e) {
			
			// Inform the user of their error and recursively call the method again
			System.out.print("\n\n- - - - ERROR - - - -\nThat was an invalid entry!\n\n");
			askToSave();
		}
	}
	
	
	// Ask the user if they want to see the results from their entries
	static void askToReview() {
		
		// Ask the user if they want to review the results
		System.out.println("\n\nWould you like to review the results?");
		System.out.print("Please enter YES or NO\n> ");
		
		// Get the answer
		String ans = scanner.next();
		
		// Convert the answer to lower case
		ans = ans.toLowerCase();
		Character ansIndex;
		
		try {
			
			// Check if the lower case character is y or n
			ansIndex = ans.charAt(0);
			if (ansIndex == 'y') {
				
				// Save the information
				FileManager.reviewFile();
			}
			
		} catch (Exception e) {
			
			// Inform the user of their error and recursively call the method again
			System.out.print("\n\n- - - - ERROR - - - -\nThat was an invalid entry!\n\n");
			askToReview();
		}
	}
	
}
