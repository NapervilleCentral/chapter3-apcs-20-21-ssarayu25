import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class DrawSquare_Student
{
public static void main(String[] args)
{
    Random gen = new Random();
    StandardPen pen = new StandardPen();
 
    // pen jumps to center of the graphics window
    //without drawing and points north
    pen.up();
    pen.home();
    
    
    pen.setColor(Color.black);
    //square
    pen.move(130);
    pen.turn(90);
    
    pen.move(130);
    pen.turn(90);
    
    pen.move(130);
    pen.turn(90);
    
    pen.move(130);
    pen.turn(90);
    
    
    //rectangle
    pen.move(500);
    pen.turn(90);
    
    pen.move(130);
    pen.turn(90);
    
    pen.move(500);
    pen.turn(90);
    
    
    //triangle
    pen.up();
    pen.home();
    pen.turn(-90);
    pen.move(300);
    pen.down();
    
    pen.move(100);
    pen.turn(120);
    
    pen.move(100);
    pen.turn(120);
    
    pen.move(100);
    pen.turn(120);
    
    





}
}