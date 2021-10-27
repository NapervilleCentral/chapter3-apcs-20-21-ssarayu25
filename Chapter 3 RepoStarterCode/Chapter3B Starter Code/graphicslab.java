import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;
import java.lang.Math.*; 
/*
 * makes a four leaf rose
 * Sarayu Suresh
 * 10/26/21
 */
public class graphicslab
{
    public static void main (String args[])
    {
        StandardPen pen = new StandardPen();        
        pen.up();
        pen.home();
        

        
        
        //four leaf rose
        for (double i = 0; i < 2*(Math.PI); i+=Math.PI/100)
        {
            double r = Math.cos(2*i);
            double x = r * Math.cos(i);
            double y = r * Math.sin(i);
            x*=100;
            y*=100;
            pen.move(x,y);
            pen.down();
        }
        
        //drunk guy walk
        Random gen = new Random();
        pen.up();
        for (int i = 0; i < 100; i++)
        {
            int turn = gen.nextInt(4);
            if (turn == 0)
                
        }
    }
}
