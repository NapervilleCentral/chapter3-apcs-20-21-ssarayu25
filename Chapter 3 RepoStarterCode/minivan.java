//Sarayu Suresh
//minivan
//ckecks to see if a minivan's door is open
//9/29/21

import java.util.Scanner;
public class minivan
{
        public static void main (String[] args)
   {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("input: ");
            String input = Keyboard.next();
            
            //assigns variables to each character of input
            char dashleft = input.charAt(0);
            char dashright = input.charAt(1);
            char childlock = input.charAt(2);
            char masterunlock = input.charAt(3);
            char inright = input.charAt(4);
            char inleft = input.charAt(5);
            char outright = input.charAt(6);
            char outleft = input.charAt(7);
            char gear = input.charAt(8);
            
            //both doors start off closed
            int left = 0;   
            int right = 0; // 1 means open, while 0 means closed
            
            //algorithim to check which doors open
            if ((masterunlock == 1) && ((gear == 'p')||(gear == 'P')))
                {if (childlock == 0)
                    {if (dashleft == 1 || inleft == 1 || outleft == 1)
                        left = 1; 
                     if (dashright == 1 || inright == 1 || outright == 1)
                        right = 1;}
                else if (childlock == 1)
                    {if (dashleft == 1 || outleft == 1) 
                        left = 1;
                    if (dashright == 1 || outright == 1)
                        right = 1;}
        
            }
            
            
            if (left == 1 && right == 1)
                System.out.println("both doors open");
            else if (left == 1 && right == 0)
                System.out.println("left door opens");
            else if (left == 0 && right == 1)
                System.out.println("right door opens");
            else if (left == 0 && right == 0)
                System.out.println("both doors stay closed");
    }

}