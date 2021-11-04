package labs;
import java.util.Scanner;
/**
 * input size and seed to get parksides other triangle
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
        int sumy = 0;
        
        for (int y = 0; y < size; y++) //y is the row number 
        {
            for (int i = 0; i < y; i++) //prints out spaces (starts with zero and goes up)
                System.out.print(" ");
                
            sumy = sumy + y; //rolling sum of the y values
            // in each line the starting value is the seed plus all the row numbers before it
            int print = seed + sumy;  
            
            if (print > 9) //since it goes from 9 to 1
                 print = print % 9;   
                 
            for (int x = y; x < size; x++) //x is the column number
            {
                print = print + x; //goes up by number that increases by one 
                if (print > 9)
                 print = print % 9;
                System.out.print(print);    
            }
            System.out.println();
        }
            
            }
        
            }
        
    

