package e03;

import java.util.Scanner;

public class LargestInput
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a series of numbers, then type Q to process: ");
      String input = in.next();
     
      int largest;
      int smallest;

      if (!input.equals("Q"))
      {
          int integerinput = Integer.parseInt(input);
          largest = integerinput;
          smallest = integerinput;
         
          while (!input.equals("Q")) // Loop on input and check for a new min or max
          {
              integerinput = Integer.parseInt(input);
             
              if (integerinput > largest)
                largest = integerinput;
              if (integerinput < smallest)
                smallest = integerinput;
               
              input = in.next();
              if (input.equals("Q")) // Output the results
                System.out.print("Largest: " + largest + "\n" + "Smallest: " + smallest);
            }
        }
         
   }
}