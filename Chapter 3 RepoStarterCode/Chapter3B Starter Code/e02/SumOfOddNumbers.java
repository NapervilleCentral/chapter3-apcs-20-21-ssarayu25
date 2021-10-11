package e02;

import java.util.Scanner;

public class SumOfOddNumbers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
   
      // Get the inputs
      System.out.println("Enter two numbers: ");
     
      int a = in.nextInt();
      int b = in.nextInt();
      int sum = 0;
     
      // The sum of odd numbers between a and b
      for(int i = a; i <= b; i++)
      {
          // Only add number if it is odd
          if( i % 2 != 0)
          {
              sum = sum + i;
          }
      }

      // Output the result
      System.out.println("The sum is " + sum + ".");
   }
}