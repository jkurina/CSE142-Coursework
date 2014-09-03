//Ch 2 Excercise 15

//Write nested for loops to produce method called printDesign that prints desired output

public class Ch_2_15 {
   public static void main(String[] args) {
      printDesign();
   }
      
   public static void printDesign() {
      for (int linenum=1; linenum<=5; linenum++) {
         for (int dashes=1; dashes<=6-linenum; dashes++) {
            System.out.print("-");
         }
         for (int i=1; i<=linenum*2-1; i++) {
            System.out.print(linenum*2-1 + "");
         }
         for (int dashes=1; dashes<=6-linenum; dashes++) {
            System.out.print("-");
         }
         System.out.println();
      }
   }
}