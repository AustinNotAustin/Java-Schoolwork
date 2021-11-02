/*******************
Name: Austin C Arledge

Date: 18 Dec 20

Notes: I kind of struggled with this for a bit! I didn't realize I had to compile it after saving and didn't need to call the file.java, all good now though.
*******************/
import java.util.Scanner;
public class WhileLoopWithBreak {

   public static void main(String[] args) {
   
      int n;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter a number > 0:");
      
      while (true) {
         n = input.nextInt();
         
         if (n > 0) {
            System.out.println(n + " is bigger than 0");
            System.out.println("Please enter a number > 0:");
         continue;
         }
         
         else {
            System.out.println("That number was not > 0! Exiting!");
            break;
         }
         
      }
   }
}