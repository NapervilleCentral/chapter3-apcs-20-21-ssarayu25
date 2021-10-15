package e02;

import java.util.Scanner;

public class SumOfOddDigits
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      // Get the input
      System.out.println("Enter a number: ");
     
      String input = in.next();
      int total = 0;
     
      // The sum of odd digits of the input
      for (int i = 0; i < input.length(); i++)
       {
          String digit = input.substring(i, i+1);
          int num = Integer.parseInt(digit);  
          // Only add digit if it is odd
          if (num % 2 != 0)
            total += num;
       }
       
      // Output the result
      System.out.print("Sum of odd digits: " + total);

   }
}