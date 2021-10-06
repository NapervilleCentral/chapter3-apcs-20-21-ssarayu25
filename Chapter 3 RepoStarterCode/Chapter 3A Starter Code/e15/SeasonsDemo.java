package e15;

import java.util.Scanner;
/**
   This program calculates the season for a given month and day.
   
   spring runs from March 1 to May 31;
summer runs from June 1 to August 31;
fall (autumn) runs from September 1 to November 30; and
winter runs from December 1 to February 28 (February 29 in a leap year).
*/
public class SeasonsDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Please enter a date (month and day): " );
      int month = in.nextInt();
      int day = in.nextInt();
      System.out.print("The season is: ");
      if (month >= 3 && month <= 5)
        System.out.println("Spring");
      else if (month >= 6 && month <=8)
        System.out.println("Summer");
      else if (month >= 9 && month <=11)
        System.out.println("Fall");
      else if (month >= 9 && month <=12)
        System.out.println("Winter");        
      else if (month >= 1 && month <= 2)
        System.out.println("Winter");
   }
}
