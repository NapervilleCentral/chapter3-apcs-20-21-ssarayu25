package e20;

import java.util.Scanner;
/**
 * Read three floating-point numbers and print
 * the largest of the three.
 */
public class MaxOfThree
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter three numbers: ");
      double largest = 0;
      
      // Place your work here
      double one = in.nextDouble();
      double two = in.nextDouble();
      double three = in.nextDouble();
      
      if (one >= two && one >= three)
        largest = one;
      else if (two >= one && two >= three)
        largest = two;
      else if (three >= two && three >= one)
        largest = three;
      
     
      
         
      System.out.println("The largest number is "  + largest);
   }
}
