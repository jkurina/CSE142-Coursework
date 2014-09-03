//Jonathon Anderson
//CSE142 Assignment#2
//8/26/14

//This program displays a constant-augmentable rocket ship (Part B Assignment 2).

public class DrawRocket {
   public static final int HEIGHT=3;
   public static void main(String[] args)  {
      triangleStars();
      divider();
      hull1();
      hull2();
      divider();
      hull2();
      hull1();
      divider();
      triangleStars();
   }
      
   public static void triangleStars() {
      for (int line=1; line<=HEIGHT*2-1; line++) {
         for (int space=1; space<=HEIGHT*2-line; space++) {
            System.out.print(" ");
         }
         for (int slash=1; slash<=line; slash++) {
            System.out.print("/");
         }
         System.out.print("**");
         for (int bslash=1; bslash<=line; bslash++) {
            System.out.print("\\");
         }
         System.out.println();
      }
   }

   public static void divider() {
      System.out.print("+");
      for (int i=1; i<=HEIGHT*2; i++) {
         System.out.print("=*");
      }
      System.out.print("+");
      System.out.println();
   }
   
   public static void hull1() {
      for (int line=1; line<=HEIGHT; line++) {
         System.out.print("|");
         for (int dots=1; dots<=HEIGHT-line; dots++) {
            System.out.print(".");
         }
         for (int pyramid=1; pyramid<=line; pyramid++) {
            System.out.print("/\\");
         }
         for (int dots=1; dots<=HEIGHT-line; dots++) {
            System.out.print(".");
         }
         for (int dots=1; dots<=HEIGHT-line; dots++) {
            System.out.print(".");
         }
         for (int pyramid=1; pyramid<=line; pyramid++) {
            System.out.print("/\\");
         }
         for (int dots=1; dots<=HEIGHT-line; dots++) {
            System.out.print(".");
         }
         System.out.println("|");
      }
   }

   public static void hull2() {
      for (int line=1; line<=HEIGHT; line++) {
         System.out.print("|");
         for (int dots=1; dots<=line-1; dots++) {
            System.out.print(".");
         }
         for (int well=HEIGHT; well>=line; well--) {
            System.out.print("\\/");
         }
         for (int dots=1; dots<=line-1; dots++) {
            System.out.print(".");
         }
         for (int dots=1; dots<=line-1; dots++) {
            System.out.print(".");
         }
         for (int well=HEIGHT; well>=line; well--) {
            System.out.print("\\/");
         }
         for (int dots=1; dots<=line-1; dots++) {
            System.out.print(".");
         }
         System.out.print("|");
         System.out.println();
      }
   }
}
