//Jonathon Anderson
//CSE142 Assignment#2
//8/26/14

//This program prints a constant-augmentable rocket ship (Part B Assignment 2).

public class DrawRocket {
   public static final int HEIGHT=10;
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
//This method prints a constant dependent "/**\" with the "/" and "\" increasing on each subsequent line based on the HEIGHT of DrawRocket     
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

//This method prints a constant dependent "+=*+" with the "=" and "*" increasing on a line based on the HEIGHT of DrawRocket     
   public static void divider() {
      System.out.print("+");
      for (int i=1; i<=HEIGHT*2; i++) {
         System.out.print("=*");
      }
      System.out.print("+");
      System.out.println();
   }
   
//This method prints the method dotsPyramid twice encapsulated by "|" based on the HEIGHT of DrawRocket
//Please see "dotsPyramid" below
   public static void hull1() {
      for (int line=1; line<=HEIGHT; line++) {
         System.out.print("|");
         dotsPyramid(line);  
         dotsPyramid(line);
         System.out.println("|");
      }
   }

//This method prints the method dotsCone twice encapsulated by "|" based on the HEIGHT of DrawRocket
//Please see "dotsCone" below
   public static void hull2() {
      for (int line=1; line<=HEIGHT; line++) {
         System.out.print("|");
         dotsCone(line);
         dotsCone(line);
         System.out.print("|");
         System.out.println();
      }
   }

//This method prints "/\" in increasing number, is line dependent and is encapsulated by dots controlled by "dotsShrink"
//Please see "dotsShrink" for the method that controls the behavior of "."
   public static void dotsPyramid(int line) {
      dotsShrink(line);
      for (int pyramid=1; pyramid<=line; pyramid++) {
         System.out.print("/\\");
      }
      dotsShrink(line);
   }

//This method prints "\/" in decreasing number, is line dependent and is encapsulated by dots controlled by "dotsGrow"
//Please see "dotsGrow" for the method that controls the behavior of "."
   public static void dotsCone(int line) {
      dotsGrow(line);
      for (int well=HEIGHT; well>=line; well--) {
         System.out.print("\\/");
      }
      dotsGrow(line);
   }
   
//This method prints several "." in decreasing number and is line dependent  
   public static void dotsShrink(int line) {
      for (int dots=1; dots<=HEIGHT-line; dots++) {
         System.out.print(".");
      }
   }

//This method prints several "." in increasing number and is line dependent  
   public static void dotsGrow(int line) {
      for (int dots=1; dots<=line-1; dots++) {
         System.out.print(".");
      }
   }
}
