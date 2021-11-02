

// Notes: This class saves data to a csv when called.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

	
	
	// Opens a file to prepare for reading and
	static void saveFile(ArrayList<Integer> numList) {
		
		try {
			new FileWriter("Avg.csv", false).close();
			FileWriter writer = new FileWriter("Avg.csv");
			
			
			
			for (Integer num : numList) {
				
				writer.append(String.valueOf(num));
				writer.append(",");
			}
			
			writer.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.print("\n\n- - - - ERROR - - - -\nI couldn't find that file!\n\n");
			
		} catch (IOException e) {
			
			System.out.print("\n\n- - - - ERROR - - - -\nI couldn't find that file!\n\n");
			
		}
	}
	
	
	// Display the file for review
	static void reviewFile() {
		
		String line;
		String[] vals = null;
		
		int numListLength = 0;
		int numListTotal = 0;
		
		try {
			FileReader reader = new FileReader("Avg.csv");
			BufferedReader buffer = new BufferedReader(reader);
			
			while ((line = buffer.readLine()) != null) {
				
				vals = line.split(",");
			}
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.print("\n\n- - - - ERROR - - - -\nI couldn't find that file!\n\n");
			
		} catch (IOException e) {
			
			System.out.print("\n\n- - - - ERROR - - - -\nI had an issue with that data!\n\n");
			
		}
		
		for (String val : vals) {
			
			numListLength ++;
			numListTotal += Integer.valueOf(val);
		}
		
		// Display the results
		System.out.println("\n\n\nRESULTS:\n\n");
		
		// Calculate the average
		Float avg = Float.valueOf(numListTotal) / numListLength;
		
		// Display the numbers to average
		System.out.printf("'%34s'", "The numbers I'm averaging are: ");
		for (String val : vals) {
			
			System.out.print(val + " ");
		}
		
		// Display the total of the numbers being averaged
		System.out.printf("\n'%34s'", "The total of list is: ");
		System.out.println(numListTotal);
		
		// Display the avg of the total
		System.out.printf("'%34s'", "The average of the total is: ");
		System.out.printf("%1.2f", avg);
	}
	
	
	// Convert the ArrayList<int> to a string
	static String intArrToStr(ArrayList<Integer> nums) {
		
		String newStr = nums.toString();
		
		return newStr;
	}
}
