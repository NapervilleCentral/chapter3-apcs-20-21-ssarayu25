package labs;

import java.util.Scanner;
/*
 * checks if a string is a palindrome
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
        int counter = 0; //how many times the second loop runs
        boolean palindrome = true;
        String goodinput = ""; //inputted string that has no spaces or uppercase letters. 
        
        for (int i = 0; i < input.length(); i++)
        {
            char character = input.charAt(i);
            if (character != ' ') //gets rid of spaces
            {
                if (character >= 65 && character <= 90) //makes uppcase lowercase
                 character = (char)((int)character + 32);
                goodinput = goodinput + character;
            }    
                 
        }
        
        for (int i = 0; i < goodinput.length()/2 && palindrome == true; i++) //only checks half of the string, so that its more efficient
        {                                              //and doesn't check the same thing twice
             char1 = goodinput.charAt(i); //checks first char and goes towards middle as loop runs
             char2 = goodinput.charAt(goodinput.length()-i-1); //checks last char then goes towards center as loop runs
             
             if (char1 != char2)
             {
                 palindrome = false;
                }   
        }
        
        if (palindrome)
            System.out.println("This is a palindrome");
        else
            System.out.println("This is not a palindrome");

    }
}
