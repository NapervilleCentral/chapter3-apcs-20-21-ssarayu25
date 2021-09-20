/**
Sarayu Suresh
9/17/21
leap year tester
**/

import java.util.Scanner;

public class leapyeartester
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter year: ");
     
      int year = in.nextInt();
      boolean leap;
      leap = false;
      
    // 
      if (year % 4 == 0)
      {
        if (year % 100 == 0) //must be divisible by 400 is divisible by 100
        {
            if (year % 400 == 0)
                leap = true;
        }
        else // if not divisible by 100, and divisible by 4
            leap = true;
    }

        
    if (year < 1582) // checks if less than 1582
       System.out.print("Error");
    else if (leap == true)
       System.out.print(year + " is a leap year");
    else
      System.out.print(year + " is not a leap year");
   }
}


/*
 *  Enter year: 1900
 *  1900 is not a leap year
 *  
 *  Enter year: 1984
 *  1984 is a leap year
 *   
 *  Enter year: 2000
 *  2000 is a leap year
 *  
 */