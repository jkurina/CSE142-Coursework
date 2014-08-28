// Ch 2 Excercise 5

// Print specific nested loop output

public class Ch_2_5 {
   public static void main(String[] args) {
      for (int lines=1; lines<=5; lines++) {
         for (int i=1; i<=lines; i++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}