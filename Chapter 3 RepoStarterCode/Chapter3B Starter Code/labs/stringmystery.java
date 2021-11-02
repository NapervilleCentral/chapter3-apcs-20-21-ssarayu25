package labs;
import java.util.Scanner;
import java.io.*;


/**
 * Write a description of class stringmystery here.
 *
 * Sarayu Suresh
 * 10/21/21
 */
public class stringmystery
{
    public static void main (String args[]) throws IOException 
    {
        Scanner scan = new Scanner(new File("labs/String Mystery input.txt"));
        
        String input = scan.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length() - 1; i++)
        {
            char char1 = input.charAt(i);
           
                char char2 = input.charAt(i + 1);
                if (char1 == char2)
                    sum += (int) char1 - 48;
                
           
        } 
        if (input.charAt(0) == input.charAt(input.length() - 1))
            sum += (int) input.charAt(0) - 48;
            
        System.out.println("Total: " + sum);
        
        
        


        sum = 0;
        for (int i = 0; i < input.length() ; i++)
        {
            char char1 = input.charAt(i);
            char char2 = input.charAt((i + input.length()/2)%input.length());
                if (char1 == char2)
                    sum += (int) char1 - 48;
                
           
        } 
        
            
        System.out.println("Total: " + sum);
    }
}
