//Sarayu Suresh
//switchexamples
//just notes
//9/22/21

import java.util.Scanner;
public class switchexample
{
        public static void main (String[] args)
   {
            Scanner Keyboard = new Scanner(System.in);
            char choice;

       // switch statement------------------------------


            System.out.print("What would you like to buy?\n");
            System.out.print("f) fries\n");
            System.out.print("c) cheese\n");
            System.out.print("s) small drink\n");
            
            
            choice = Keyboard.next().charAt(0);
            
            //switch can use char, int, and String
            //a switch finds true and cascades: finds the true, and executes everything below
            //break will stop cascade
            switch (choice) 
            {
                case 'F': // do this instead of 'f' || 'F'
                case 'f': // no ors
                    System.out.print(".99");
                    break;
                case 'c':
                    System.out.print("2.50");
                    break;
                case 's':
                    System.out.print("1.29");
                    break;
                default: //replaces the else statment
                    System.out.print("Error on Input");



                }
    }//end of main

}//end of class