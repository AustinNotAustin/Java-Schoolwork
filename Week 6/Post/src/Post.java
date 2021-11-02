
public class Post {

   public static void main(String[] args) {
   
      // Arrays are a grouping of related item. In java we call them arrays, in other language like python, we call them lists if they’re mutable, or arrays is they’re non-mutable.
      // In java arrays are mutable, but the values within it are not. They can however be pointed to another value.
      // Here’s a couple string variables 
      String one = "1"; 
      String two = "2"; 
      String three = "3"; 
      String four = "4";

      // Here’s an array of strings
      String[] arrayOfStrings = {one, two, three};

      // Let's print the arrayOfStrings array
      System.out.println("arrayOfStrings default: " + arrayOfStrings[0] + ", " + arrayOfStrings[1] + ", " + arrayOfStrings[2]);
      
      // Outputs: arrayOfStrings default: 1, 2, 3
      
      // Now let's change a value of the array to see this mutable array in action
      arrayOfStrings[2] = four;
      
      // There, now I assigned the last string in the array to the variable four, which has a value of "4"
      // Let's print it out and see
      System.out.println("arrayOfStrings updated: " + arrayOfStrings[0] + ", " + arrayOfStrings[1] + ", " + arrayOfStrings[2]);
      
      // Outputs: arrayOfStrings updated: 1, 2, 4
      
      // Now that we understand an arrays are mutable, let's break it
      // I always find breaking things (seeing how something DOESN'T work) leads to learning
      
      // Let's define a new array to play with
      int[] arrayOfInts = {4, 2, 0};
      
      // Here's a printed version of the array
      System.out.println("arrayOfInts default: " + arrayOfInts[0] + arrayOfInts[1] + arrayOfInts[2]);
      
      // Outputs: arrayOfInts default: 420
      
      // Let's use a try and catch to show our broken array
      try {
         
         arrayOfInts[3] = 0;
      } catch (Exception e) {
         
         System.out.println("You can't do that!");
      }

   }
}