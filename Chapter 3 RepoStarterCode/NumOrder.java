/**
Write a program that reads three numbers and prints "increasing" if they are in increasing order, 
"decreasing if they are in decreasing orderand "neither" otherwise. 
Here "increasing" means each value is larger than its predecessor 3 4 4 is not be considered increasing

**/

import java.util.Scanner;

public class NumOrder
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter three numbers: ");
     
      int one = in.nextInt();
      int two = in.nextInt();
      int three = in.nextInt();
     
      if (one<two && two<three)
        System.out.println("Increasing order");
      else if (three<two && two<one)
        System.out.println("Decreasing order");
      else
        System.out.println("neither");
   }
}