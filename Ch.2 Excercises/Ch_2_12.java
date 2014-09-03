//Ch 2 Excercise 12

//Write nested for loops to produce output

public class Ch_2_12 {
   public static void main(String[] args) {
      for (int linenum=1; linenum<=3; linenum++) {
         for (int i=0; i<=9; i++) {  
            for (int j=1; j<=3; j++) {
               System.out.print(i%10 + "");
            }
         }
         System.out.println();
      }
   }
}