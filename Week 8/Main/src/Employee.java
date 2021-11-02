/*******************
Name: Austin C Arledge

Date: 27 Jan 21

Notes: Run Employee.java in the root folder.
*******************/

//Employee.java

import java.util.Scanner;

class Employee {

	Scanner input = new Scanner(System.in);

	// Define the Employee attributes
	int ID;
	String name;
	int age;
	int salary;

	// Get the objects attributes and display them to the user
	void GetData() {
		// This is not a traditional getter since it is display the information to the user and not returning a value.
		// If I needed the value for use I would instead return the values with individual getters 

		System.out.println(" " + this.ID + "     " + this.name + "       " + this.age + "       " + this.salary);
	}
	
	// Put/Set the objects attributes
	void PutData(int x) {

		// Tell the user what's going on
		System.out.println("Enter the details of Employee " + String.valueOf(x) + ": ");
		
		// Ask the user for each attribute & then store that value
		System.out.println("Enter the Employee's ID <int>: ");
		String newID = input.nextLine();
		
		System.out.println("Enter the Employee's name <string>: ");
		String newName = input.nextLine();
		this.name = newName;
		
		System.out.println("Enter the Employee's age <int>: ");
		String newAge = input.nextLine();
		
		System.out.println("Enter the Employee's salary <int>: ");
		String newSalary = input.nextLine();

		try {

			this.ID = Integer.parseInt(newID);
			this.age = Integer.parseInt(newAge);
			this.salary = Integer.parseInt(newSalary);
			
		} catch (Exception e) {
			System.out.println("\n\n   You must enter an integer for the ID, Age, and Salary.   \n\n");
			System.out.println("Try again. \n");
			this.PutData(x);
		}
	}

	public static void main(String args[]) {

		Employee[] Emp = new Employee[3];

		// Create each new object/employee
		for(int x = 0; x < 3; x++) {
			
			Emp[x] = new Employee();
		}

		// Collect and store the data for each object/employee
		for (int x = 0; x < 3; x++) {
		
			Emp[x].PutData(x);
		}

		// Tell the user you are now displaying their values
		System.out.println("\n\nDetails of the new employees:");
		System.out.println("  ID   |   Name   |   Age   |   Salary  ");
		
		// Display each object/employee's information
		for(int x = 0; x < 3; x++) {

			Emp[x].GetData();
		}

	}

}