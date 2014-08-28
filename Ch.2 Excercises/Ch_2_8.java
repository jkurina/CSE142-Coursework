// Ch 2 Excercise 8

// Print output using nested loops

public class Ch_2_8 {
   public static void main(String[] args) {
      //This for loop generates 5 lines of output
      for (int lines=1; lines<=5; lines++) {
         //This for loop prints spaces
         for (int i=1; i<=5-lines; i++) {
            System.out.print(" ");
         }
         //This for loop prints the line in a pyramid
         for (int j=1; j<=lines; j++) {
            System.out.print(lines +"");
         }
      System.out.println();
      }
   }
}