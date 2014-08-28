// Ch.2 Excercise 3

// Loop that computes and prints the first 12 Fibonacci numbers

public class Ch_2_3 {
   public static void main(String[] args) {
      int i= 0;
      int j= 0;
      int n= 1;
      for (int k=1; k<=12; k++) {         
         System.out.print(n + " ");
         j= i;
         i= n;
         n= i + j;         
      }      
   }
}