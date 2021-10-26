import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;
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
        // pen jumps to center of the graphics window
        //without drawing and points north
        pen.up();
        pen.home();
        pen.move(25);
        pen.turn(90);
        pen.move(25);
        pen.down();
        pen.setColor(Color.black);
        
        //four leaf rose
        
    }
}
