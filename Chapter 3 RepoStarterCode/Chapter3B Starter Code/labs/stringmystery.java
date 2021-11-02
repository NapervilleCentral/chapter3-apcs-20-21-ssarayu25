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
        int counter = 0;
        for (int i = 0; i < input.length() - 1; i++)
        {
            char char1 = input.charAt(i);
            //if (input.indexOf(char1) == input.length() - 1)
                //if (input.charAt(i) == input.charAt(0))
                    //counter += (int) char1;
            //else 
            //{
                char char2 = input.charAt(i + 1);
                if (char1 == char2){
                    counter += (int) char1;
                //}
           }
        } 
        System.out.println("Total: " + counter);
    }
}
