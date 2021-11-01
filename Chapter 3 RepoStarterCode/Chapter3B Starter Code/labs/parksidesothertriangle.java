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
        int y=0;
        
            for (int x = 0; x < size; x++)
            {
                
                int print = y + seed;
                y = x+1;
                if (print != 9)
                 System.out.print(print % 9);
                else
                 System.out.print(print);    
            }
            System.out.println();
        
            
            }
        
            }
        
    

