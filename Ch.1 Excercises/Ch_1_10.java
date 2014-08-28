// Ch.1 Excercise 10

//This program displays simple ASCII art.
public class Ch_1_10 {
   public static void main(String[] args) {
      eggtop();
      eggbottom();
      System.out.println();
      crack();
      eggtop();
      eggbottom();
      System.out.println();
      crack();
      eggbottom();
      System.out.println();
      eggtop();
      crack();
      eggbottom();
   }

//This method prints the top of the egg   
   public static void eggtop() {
      System.out.println("  _______ ");
      System.out.println(" /       \\");
      System.out.println("/         \\");
   }

//This method prints the crack   
   public static void crack() {
      System.out.println("-\"-'-\"-'-\"-");
   }

//This method prints the bottom of the egg   
   public static void eggbottom() {
      System.out.println("\\         /");
      System.out.println(" \\_______/");
   }

}