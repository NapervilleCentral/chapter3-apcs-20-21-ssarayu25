package labs;

import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;
import java.lang.Math.*; 
import javafx.scene.control.Spinner;

/*
 * makes a four leaf rose, drunkards walk, spiral, fibbinocci
 * Sarayu Suresh
 * 10/26/21
 */
public class graphicslabs
{
    public static void main (String args[])
    {
        StandardPen pen = new StandardPen();        
        pen.up();
        pen.home();
        

        
        
        //four leaf rose
        /*
        for (double i = 0; i < 2*(Math.PI); i+=Math.PI/50) //goes in 100 steps from 0 to 2pi
        {
            double r = Math.cos(2*i);
            double x = r * Math.cos(i);
            double y = r * Math.sin(i);
            x*=100;
            y*=100;
            pen.move(x,y);
            pen.down();
        }
        */
        //drunk guy walk
        Random gen = new Random();
        /*
        pen.up();
        pen.home();
        pen.down();
        for (int i = 0; i < 100; i++) //runs 100 times
        {
            int turn = gen.nextInt(4); // random number from 0 to 3, which represts which way the guy turns
            if (turn == 0)
                pen.turn(90); //turns right
            else if (turn == 1)
                pen.turn (180);//goes backwards
            else if (turn == 2) 
                pen.turn(270); //goes left
            //if its 4 it stays the same way, so no need to write that code
            pen.move(10); //it moves no matter which way he turns, every iteration
        }
        */
       
       //spiral
       /*
        pen.up();
        pen.home();

        pen.setColor(Color.black);
        pen.down();
        for (int i = 10; i < 10000; i+=10)
        {
            pen.move(i);
            pen.turn(90);
    }
    */

        }
        
        
        
    }

