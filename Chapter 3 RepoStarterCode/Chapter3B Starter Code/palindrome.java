import java.util.Scanner;
/**
 * checks if a string is a palindrome
 *
 * Sarayu Suresh
 * 10/25/21
 */
public class palindrome
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a sentence and it will tell you whether or not its a palindrome. ");
        String input = in.nextLine();
        char char1 = 'a';
        char char2 = 'b';
        int counter = 0;
        boolean palindrome = true;
        String goodinput = "";
        for (int i = 0; i < input.length(); i++)
        {
            char character = input.charAt(i);
            if (character != ' ')
            {
                if (character >= 65 && character <= 90)
                 character = (char)((int)character + 32);
                goodinput = goodinput + character;
            }    
                 
        }
        for (int i = 0; i < goodinput.length()/2; i++)
        {
             char1 = goodinput.charAt(i);
             char2 = goodinput.charAt(goodinput.length()-i-1);
             
             if (char1 != char2)
             {
                 palindrome = false;
                 break;
                }   
        }
        
        if (palindrome)
            System.out.println("This is a palindrome");
        else
            System.out.println("This is not a palindrome");

    }
}
