package e03;


/**
 * Specifically, they need you to find the two entries that sum to 2020
 * and then multiply those two numbers together.

For example, suppose your expense report contained the following:
1721
979
366
299
675
1456
In this list, the two entries that sum to 2020 are 1721 and 299.
Multiplying them together produces 1721 * 299 = 514579,
so the correct answer is 514579.

Of course, your expense report is much larger.
Find the two entries that sum to 2020;
what do you get if you multiply them together?
 *
 * Isabel and Sarayu
 * 10/14/21
 */

import java.io.*;       //for File IO
import java.util.Scanner;

public class find2020
{

     public static void main (String [] args) throws IOException // required for File IO
     {
       
        Scanner scanFile = new Scanner(new File("e03/mistery2020.txt"));
       
   
        while(scanFile.hasNext())
        {
           String input = scanFile.next();
           int intinput = Integer.parseInt(input);
           
           Scanner scan2 = new Scanner(new File("e03/mistery2020.txt"));
           
           while(scan2.hasNext())
           {
               String input2 = scan2.next();
               int intinput2 = Integer.parseInt(input2);
               
               if (intinput + intinput2 == 2020)
               {
                   System.out.println("Two numbers: " + intinput + " and " + intinput2);
                   System.out.println("Product = " + (intinput * intinput2));
               }
           }
           
        }
     }//end of main
}//end of class