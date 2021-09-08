/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */
import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;


public class ch3notesstartercode
{
public static void main (String [] args)
{

        Scanner Keyboard = new Scanner(System.in);
/**/
    String word1 = "apple";
    String word2 = "cat";
    String word3 = "dog";

    if(word2.compareTo(word1)<0)//;end a statement BAD BAD simicolen
    {
        System.out.println(word2 +" is before " + word1  );
        System.out.println("and cats are evil" );
    }//ctrl M - will match brackets
    else
        System.out.println(word1 +" is before " + word2  );

    if(word2.compareTo(word3)<0)
        System.out.println(word2 +" is before " + word3  );
        
    if (word3.equals("Dog")) // don't but semicolon after if statement., it ends the if statement
        System.out.print(word3+"=" + "Dog");
/*

      int num = 5, num1 =10, num2 = 4;  // standard hours in a work week

      System.out.print ("Enter a number ");
      num = Keyboard.nextInt();
/**      
      //ORDER IS IMPORTANT
      
      if (num < 1000) //if condition is true will exe
      {
         System.out.print("Your score is average");
      }
      else if (num <2000) //condition is false will execute
         System.out.print("Your Score is Good"); 
      else if (num < 500)
        System.out.print("Your Score is Low");
 /**     
      
      if (num < 1000) //if condition is true will exe
      {
         System.out.print(true);
         System.out.print(true); // multi lines need brackets
      }
      else //condition is false will execute
         System.out.print(false); //if you have one line it will match if else
/**
       System.out.print ("Enter a  second number ");
       num1 = Keyboard.nextInt();

       System.out.print ("Enter a  third number ");
       num2 = Keyboard.nextInt();

      System.out.println ();
/*

       boolean a = true, b = false, c = false,d;
        //System.out.println(a  );
      // c =(a = true) || (b = true);
      // System.out.println(a + "-" + b + "-" + c);


    //   c = (a = false) || (b = true);
    //   System.out.println(a + "-" + b+ "-" + c);

//     c =(a = false) && (b = true);
 //    System.out.print(a + "-" + b+ "-" + c);
//
//     c = (a = true) && (b = false);
//     System.out.print(a + "-" + b + "-" + c);

//     d =!(a = true) || (b = true) && (c = true);
//     System.out.print(a + "-" + b + "-" + c+ "-" + d);


/*  */

}// end of main


}// end of class









