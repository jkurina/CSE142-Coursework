// Ch. 2 Excerise 2

//Write a simple for loop

public class Ch_2_2 {
   public static void main(String [] args) {
      for (int i=1; i<=10; i++) {
         System.out.print(i * i +" ");
      }

//Duplicate output challenge (no "*" allowed)      
      int i=0;
      for (int n=1; n<=19; n=n+2) {
         System.out.print(n + i + " ");
         i=n + i;
      }
   }
}   
