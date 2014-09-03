//Ch 2 Excercise 11

// Print a rotating increasing list of single-digit numbers w/ a class constants

public class Ch_2_11 {
   
   public static final int RANGE=7;
   
   public static final int REPETITIONS=5;
   
   public static void main(String[] args) {
      for (int i=1; i<=REPETITIONS; i++) {
         for (int j=1; j<=RANGE; j++) {
            System.out.print(" ");
         }
         System.out.print("|");
      }
      System.out.println();
      
      for (int i=1; i<=REPETITIONS; i++) {
         for (int j=1; j<=RANGE; j++) {
         System.out.print(j%10 + "");
         }
         System.out.print("0");
      }
   }
}