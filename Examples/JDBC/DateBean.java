package week1driver;

import java.sql.*;

// Austin Arledge
// 9 April 2021

// Connects to a MySQL database, calls a command, prints the result.

public class Driver {

	public static void main(String[] args) {
		
		try {
            
			// Connect to SQL BD
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/week1", "root", "root");
			
			// Create statement
			Statement stmnt = conn.createStatement();
			
			// Execute SQL query
			ResultSet rs = stmnt.executeQuery("select * from employees");
			
			// Process results
			while (rs.next()) {
				System.out.println("Employee Name: " + rs.getString("Employee_Name") + "\nSalary: " + rs.getString("Salary") + "\nJob: " + rs.getString("Job"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
