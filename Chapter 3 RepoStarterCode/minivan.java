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
            
            char dashleft = input.charAt(0);
            char dashright = input.charAt(1);
            char childlock = input.charAt(2);
            char masterunlock = input.charAt(3);
            char inright = input.charAt(4);
            char inleft = input.charAt(5);
            char outright = input.charAt(6);
            char outleft = input.charAt(7);
            char gear = input.charAt(8);
            
            int left = 0;
            int right = 0;
            
           
            if ((masterunlock == 1) && ((gear == 'p')||(gear == 'P')))
                {if (childlock == 0)
                    {if (dashleft == 1 || inleft == 1 || outleft == 1)
                        left = 1;
                    else if (dashright == 1 || inright == 1 || outright == 1)
                        right = 1;}
                else if (childlock == 1)
                    {if (dashleft == 1 || outleft == 1)
                        left = 1;
                    else if (dashright == 1 || outright == 1)
                        right = 1;}
                 
                    
            }

    }

}