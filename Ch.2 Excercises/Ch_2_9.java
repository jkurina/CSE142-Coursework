// Ch 2 Excercise 9

//Print output using nested for loops

public class Ch_2_9 {
   public static void main(String[] args) {
      for (int wide=1; wide<=1; wide++) {
         for (int dash=wide; dash<=40; dash++) {
            System.out.print("-");
         }
         System.out.println();
         for (int face=wide; face<=10; face++) {
            System.out.print("_-^-");
         }
         System.out.println();
         for (int j=1; j<=2; j++) {
            for (int i=1; i<=10; i++) {
            System.out.print(i%10 + "");
            System.out.print(i%10 + "");
            }
         }
         System.out.println();
         for (int dash=wide; dash<=40; dash++) {
            System.out.print("-");
         }
         System.out.println();

      }
   }
}