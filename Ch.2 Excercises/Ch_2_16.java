//Ch 2 Excercise 16

//Write nested for loops to produce a program called "SlashFigure" that prints desired output


public class Ch_2_16 { //public class SlashFigure {
   public static void main(String[] args) {
      for (int linenum=1; linenum<=6; linenum++) {
         for (int bslashes=1; bslashes<=linenum*2-2; bslashes++) {
            System.out.print("\\");
         }
         for (int exclamations=1; exclamations<=26-linenum*4; exclamations++) {
            System.out.print("!");
         }
         for (int slashes=1; slashes<=linenum*2-2; slashes++) {
            System.out.print("/");
         }
         System.out.println();
      }
   }
}