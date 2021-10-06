/**
Sarayu Suresh
9/27/21
taxes
calculates simple progressive tax rate
**/

import java.util.Scanner;
public class taxes
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter yearly income: ");
      double income = in.nextDouble();
      double tax;
      // figuring out tax, dependent on user input
      if (income <= 50000)
        tax = income * 0.01;
      else if (income <= 75000)
        tax = 50000 * 0.01 + (income - 50000) * 0.02;
      else if (income <= 100000)
        tax = 50000 * 0.01 + (75000 - 50000) * 0.02 + (income - 75000) * 0.03;
      else if (income <= 250000)
        tax = 50000 * 0.01 + (75000 - 50000) * 0.02 + (100000 - 75000) * 0.03 + (income - 100000) * 0.04;
      else if (income <= 500000)
        tax = 50000 * 0.01 + (75000 - 50000) * 0.02 + (100000 - 75000) * 0.03 + (250000 - 100000) * 0.04 + (income - 250000)* 0.05;
      else 
        tax = 50000 * 0.01 + (75000 - 50000) * 0.02 + (100000 - 75000) * 0.03 + (250000 - 100000) * 0.04 + (500000 - 250000) * 0.05 +(income-500000) * 0.06;
        
      
      System.out.println("Your tax total is " + tax);
   }       
}