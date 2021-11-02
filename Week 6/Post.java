
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
         System.out.println("arrayOfInts broken: " + arrayOfInts[0] + arrayOfInts[1] + arrayOfInts[2] + arrayOfInts[3]);
      } catch (Exception e) {
         
         System.out.println("You can't do that!");
      }

      // We expected to be able to add a variable to the array, but we can't
      // We wanted to see 4200 but instead caught an Exception

      // Outputs: You can't do that!
      
      // This helps us understand that we can't changed the array itself, but we can change what the array points to within
      
      // Let's do one more thing to break it and learn a bit
      
      // I'll create a new array and then use a try and catch to break it
      int[] arrayOfNumbers = {6, 0, 0};
      
      try {
         
         arrayOfNumbers[2] = "nine";
         System.out.println(arrayOfNumbers[0] + arrayOfNumbers[1] + arrayOfNumbers[2]);
      } catch (Exception e) {
      
         System.out.println("You can't add a string to an array made for ints!");
      }
      
      // Desired output: 60nine
      
      // Expected catch exception output: You can't add a string to an array made for ints!
      
      // Actual output: Post.java:66: error: incompatible types: String cannot be converted to int
      
      // This shows that we can't add non-int objects on an array made for int objects
      
      // It also shows that we can't even catch them!
      
      // Thanks for listening.
      
      // I hope you enjoyed by 12 year old humor.
   }
}