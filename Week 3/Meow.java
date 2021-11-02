public class Meow {

   // Set the sentence string to be defined
   private String sentence;
   
   
   // Getter
   public String getMeow() {
      
      return sentence;
   }
   
   
   // Setter
   public void setMeow(String str) {

      String newStr = str + " meow.";
      this.sentence = newStr;
   }
}