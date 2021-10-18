 
import java.util.Scanner;

/**
 * gets a string from user and prints 
 *   -one char per line
 *   -one char at time in reverse
 *   -only the upper case letters
 *   -all the vowels replaced by an underscore 
 *   -number of vowels in the string
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
        System.out.println("Enter a Sentence, and it will be printed one character at a time (\"Q\" signifies end)");
        char character = ' ';
        char condition = ' ';
        
        while(condition != '.')
        {
            String input = in.next();
            
            for (int i = 0; i < input.length(); i++)
            {
                character = input.charAt(i)                   ;
                System.out.println(character);
                if (character== '.')
                    condition = '.';
                else 
                    System.out.println(character);
            }
            
        }
        
        
        //one char at time in reverse
        System.out.println("Enter a Sentence, and it will be printed one character at a time backwards (\"Q\" signifies end)");
        condition = ' ';
        
        while(condition != '.')
        {
            String input = in.next();
            
            for (int i = input.length(); i > 0; i--)
            {
                character = input.charAt(i-1);
                if (character == '.')
                    condition = '.';
                else 
                    System.out.println(character);
            }
            
        }
        
        
        //only the upper case letters
        System.out.println("Enter a Sentence, and all the uppercase characters will be printed(\".\" signifies end)");
        condition = ' ';
        while(condition != '.')
        {
            String input = in.next();
            
            for (int i = 0; i < input.length(); i++)
            {
                character = input.charAt(i-1);
                if (character == '.')
                    condition = '.';
                else if (character >= 65 && character <= 90)
                    System.out.print(character);
            }
            
        }
        
        
        //all the vowels replaced by an underscore (substring)
        System.out.println("Enter a Sentence, and all vowels will be replaced by underscore (\".\" signifies end)");
        condition = ' ';
        while(condition != '.')
        {
            String input = in.next();
            
            for (int i = 0; i < input.length(); i++)
            {
                character = input.charAt(i-1);
                if (character == '.')
                    condition = '.';
                else if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y')
                    System.out.print(character);
            }
            
        }
        
        
        //all the vowels replaced by an underscore (substring)
        System.out.println("Enter a Sentence, and number of vowels in the string will be printed (\".\" signifies end)");
        condition = ' ';
        int total = 0;
        while(condition != '.')
        {
            String input = in.next();
            
            for (int i = 0; i < input.length(); i++)
            {
                character = input.charAt(i-1);
                if (character == '.')
                    condition = '.';
                else if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y')
                    total ++;
            }
            
        }
        System.out.println(total);
        
    }
    
}
