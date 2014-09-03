//Ch 2 Excercise 13

//Write nested for loops to produce output

public class Ch_2_13 {
   public static void main(String[] args) {
      for (int linenum=1; linenum<=5; linenum++) {
         for (int i=9; i>=0; i--) {  
            for (int j=1; j<=5; j++) {
               System.out.print(i%10 + "");
            }
         }
         System.out.println();
      }
   }
}