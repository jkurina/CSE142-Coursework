//Ch 2 Excercise 17

//Write nested for loops to produce a program called "SlashFigure2" that prints desired output using a HEIGHT constant


public class Ch_2_17 { //public class SlashFigure2 {
   
   public static final int HEIGHT=10;
   
   public static void main(String[] args) {
      for (int linenum=1; linenum<=HEIGHT; linenum++) {
         for (int bslashes=1; bslashes<=linenum*2-2; bslashes++) {
            System.out.print("\\");
         }
         for (int exclamations=1; exclamations<=HEIGHT*4-(linenum*4-2); exclamations++) {
            System.out.print("!");
         }
         for (int slashes=1; slashes<=linenum*2-2; slashes++) {
            System.out.print("/");
         }
         System.out.println();
      }
   }
}