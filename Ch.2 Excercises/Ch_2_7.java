// Ch 2 Excercise 7

// Print output using nested loops

public class Ch_2_7 {
   public static void main(String[] args) {
      for (int lines=1; lines<=5; lines++) {         
         for (int j=5; j>=lines; j--) {
               System.out.print(" ");
         }
         for (int i=lines; i<=lines; i++) {
            System.out.print(i + "");
         }
         System.out.println();
      }
   }
}