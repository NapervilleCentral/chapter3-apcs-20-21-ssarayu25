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
        for (int i = 0; i < input.length() && char1 != char2; i++)
        {
             char1 = input.charAt(i);
             char2 = input.charAt(input.length()-i-1);
             counter ++;
        }
        
        if (counter > (input.length()/2))
            System.out.println("This is a palindrome");
        else
            System.out.println("This is not a palindrome");

    }
}
