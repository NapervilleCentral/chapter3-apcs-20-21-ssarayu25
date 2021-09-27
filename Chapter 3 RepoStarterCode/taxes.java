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
     
      if (income <= 50000)
        tax = income * 0.01;
      else if (income <= 75000)
        tax = 50000 * 0.01 + (income - 50000) * 0.02;
      else if (income <= 100000)
        tax = 50000 * 0.01 + 25000 * 0.02 + (income - 75000) * 0.03;
      else if (income <= 250000)
        tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + (income - 250000) * 0.04;
      else if (income <= 500000)
        tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 25000 * 0.04 + (income - 500000)* 0.05;
      else 
        tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 25000 * 0.04 + (income-600000) * 0.06;
        
      
      System.out.println("Your tax total is " + tax);
   }       
}