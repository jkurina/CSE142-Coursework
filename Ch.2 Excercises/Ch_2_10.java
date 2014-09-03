//Ch 2 Excercise 10

// Print a rotating increasing list of single-digit numbers

public class Ch_2_10 {
   public static void main(String[] args) {
      for (int i=1; i<=6; i++) {
         for (int j=1; j<=9; j++) {
            System.out.print(" ");
         }
         System.out.print("|");
      }
      System.out.println();
      
      for (int i=1; i<=6; i++) {
         for (int j=1; j<=10; j++) {
         System.out.print(j%10 + "");
         }
      }
   }
}