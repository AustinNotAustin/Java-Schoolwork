/*
* Name: Austin C Arledge
* 
* Date: 2 Jan 21 (Happy new year!)
* 
* 
* Notes: I created a class "Car".
* 
* I created the variables for Car: "make" & "model". 
* 
* I changed those values in the main method. 
* 
* I displayed those assigned values from the MAIN method "main()", of the MAIN class "Car".
* 
* I didn't see a need for the second class "CarObject" since I can create it here.
* 
* If that's not what you wanted I can adjust to whatever you expected.
* 
*/

public class Car {

   String make = "make";
   String model = "model";

   public static void main(String[] args) {
   
      Car hondaCivic = new Car();
      
      hondaCivic.make = "Honda";
      hondaCivic.model = "Civic";
      
      System.out.println(hondaCivic.make);
      System.out.println(hondaCivic.model);
   }
}
