//Ch 2 Excercise 14

//Write nested for loops to produce output

public class Ch_2_14 {
   public static void main(String[] args) {
      for (int linenum=1; linenum<=4; linenum++) {
         for (int i=9; i>=0; i--) {  
            for (int j=1; j<=i; j++) {
               System.out.print(i%10 + "");
            }
         }
         System.out.println();
      }
   }
}