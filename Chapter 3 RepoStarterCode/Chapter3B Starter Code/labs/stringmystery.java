package labs;
import java.util.Scanner;
import java.io.*;
/**
 * reviews a sequence of digits (your puzzle input) and find all digits that match the next digit in the list. 
* then does the same thing but instead of using the next digit youuse the digit halfway around the circular list`
 * Sarayu Suresh
 * 10/21/21
 */
public class stringmystery
{
    public static void main (String args[]) throws IOException 
    {
        Scanner scan = new Scanner(new File("labs/String Mystery input.txt"));
        String input = scan.nextLine();

        //part 1
        int sum = 0;
        //goes through everything except the last char(last char is checked outside loop))
        for (int i = 0; i < input.length() - 1; i++) 
        {
                char char1 = input.charAt(i); 
                char char2 = input.charAt(i + 1);
                if (char1 == char2)
                    sum += (int) char1 - 48; //-48 to convert ascii value to actual integer value
                
           
        } 
        // circular list - checks if first and last are equal
        if (input.charAt(0) == input.charAt(input.length() - 1)) 
            sum += (int) input.charAt(0) - 48;   
        System.out.println("Total: " + sum);
        
        //part 2
        sum = 0; //reset sum
        for (int i = 0; i < input.length() ; i++)
        {
            char char1 = input.charAt(i);
            //modulus makes sure that you don't get out of bounds error
            char char2 = input.charAt((i + input.length()/2)%input.length()); 
            
            if (char1 == char2)
               sum += (int) char1 - 48;
                
           
        }   
        System.out.println("Total: " + sum);
    }
}
