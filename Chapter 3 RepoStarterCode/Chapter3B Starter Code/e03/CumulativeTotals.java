package e03;

import java.util.Scanner;

public class CumulativeTotals
{
   public static void main(String[] args)
   {
      double sum = 0.0;
      Scanner in = new Scanner(System.in);
      double doubleinput;
     
      String answer = "Y";
      while (answer.equals("Y")) // enter in another set and display total
      {
          // enter in a set of numbers until they hit q, display total
          System.out.print("Enter a series of numbers, then type Q to process: ");
          String input = in.next();
          while (!input.equals("Q"))
          {
              doubleinput = Double.parseDouble(input);
             
              sum = sum + doubleinput;
             
              input = in.next();
              if (input.equals("Q")) // Output the results
              {  
                System.out.println("The total is " + sum);
                // ask, "Do you want more numbers? Y/N"
                System.out.println("Do  you want more numbers? (Y/N) ");
                answer = in.next();
               
                input = "Q";
              }
           
          }
        }
    }  
}