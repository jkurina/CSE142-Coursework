// Ch 2 Excercise 4

// Simple nested for loops w/ print

public class Ch_2_4 {
   public static void main(String[] args) {
      for (int lines=1; lines<=4; lines++) {
         for (int i=1; i<=5; i++) {
            System.out.print("*");
         }
         
         System.out.println();
      }
   }
}