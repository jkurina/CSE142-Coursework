// Chapter 3 Self Check #10

//Write a method called printStrings that accepts a String and a number of repetitions as parameters 
//and prints that String the given number of times with a space after each time.

public class Self_Check_10 {
   public static void main(String[] args) {
      String text = "abc";
      
      printStrings(text, 10);   
      
   }   
   public static void printStrings(String text, int repetitions) {
      for (int x=1; x<=repetitions; x++) {
         System.out.print(text + " ");      
      }
   }
}