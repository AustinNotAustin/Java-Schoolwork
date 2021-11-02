/*******************
Name: Austin C Arledge

Date: 24 Dec 2020

Notes: 
*******************/

import java.util.Scanner;


public class Main {

   // Pass a value through main
   public static void main(String[] args) {
      
      // Inform the user what's happening
      System.out.println("This is a simple Super Troopers Meow-inator");
      
      // Create a new Meow object so we can alter it
      Meow newMeowObj = new Meow();
      
      // Create the object to recieve user input
      // Get the sentence the user would like to alter
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a sentence: ");
      String str;
      str = input.nextLine();
      
      // Set the new sentence from the user to be Meow'd
      newMeowObj.setMeow(str);
      
      // Return the Meow'd sentence
      String newStr = newMeowObj.getMeow();
      
      // Print the Meow'd sentence to the user
      System.out.println(newStr);
   }
}