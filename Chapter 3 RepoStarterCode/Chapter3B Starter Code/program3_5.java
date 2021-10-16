 
import java.util.Scanner;

/**
 * gets a string from user and prints 
 *   -one char per line
 *   -one char at time in reverse
 *   -only the upper case letters
 *   -all the vowels replaced by an underscore (substring)
 *   
 *   
 * sarayu suresh
 * 10/15/21
 */
public class program3_5
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        
        //one char per line
        System.out.println("Enter a Sentence, and it will be printed one character at a time (\".\" signifies end of sentence)");
        char character = ' ';
        
        while(character != '.')
        {
            String input = in.next();
            
            for (int i = 0; i < input.length(); i++)
            {
                character = input.charAt(i);
                System.out.println(character);
            }
            
        }
        
        
        //one char at time in reverse
        System.out.println("Enter a Sentence, and it will be printed one character at a time backwards (\".\" signifies end of sentence)");
        char condition = ' ';
        while(condition != '.')
        {
            String input = in.next();
            
            for (int i = input.length(); i > 0; i--)
            {
                character = input.charAt(i-1);
                System.out.println(character);
                if (character == '.')
                    condition = '.';
            }
            
        }
        
        
        
    }
    
}
