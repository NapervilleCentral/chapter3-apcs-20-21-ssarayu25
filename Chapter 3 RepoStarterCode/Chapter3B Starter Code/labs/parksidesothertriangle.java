package labs;
import java.util.Scanner;


/**
 * input size and seed to get last number in pattern
 *
 * sarayu suresh
 * 10/30/21
 */
public class parksidesothertriangle
{
    public static void main (String args[])
    {
        Scanner gen = new Scanner(System.in);
        System.out.println("enter size and seed (size first)");
        int size = gen.nextInt();
        int seed = gen.nextInt();
          
        
        for (int y = 0; y < size; y++)
        {
            for (int i = 0; i < y; i++)
                System.out.print(" ");
            int print = seed + y;
            if (print > 9)
                 print = print % 9;
            for (int x = y; x < size; x++)
            {
                print = print + x;
                if (print > 9)
                 print = print % 9;
                System.out.print(print);    
            }
            System.out.println();
        }
            
            }
        
            }
        
    

