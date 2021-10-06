import java.util.Scanner;
/**
 * Sarayu Suresh
 * 9/21/21
 * triangleprogram
 * 
 * Give the user the option to enter sides or angles of the triangle.The lengths will test whether 
 * the triangle is scalene, isosceles, or equilateral. The angles will test to see if it is a right, 
 * isosceles or equilateral.
 */
public class triangleprogram
{
    public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String triangle = "";
      //menu
      System.out.println("Do you want to enter angles or sides");
      System.out.println("For angles, enter 1");
      System.out.println("For sides, enter 2");
      int option = in.nextInt();
      
    if (option == 1) //angles
      {
      System.out.println("Enter angles: ");
      int angle1 = in.nextInt();
      int angle2 = in.nextInt();
      int angle3 = in.nextInt();
    
      if (((angle1 + angle2 + angle3) == 180) && (angle1 > 0) && (angle2 > 0) && (angle3 > 0)) //checks if valid triangle
      {
          
          if (angle1 == angle2 && angle2 == angle3)
            triangle = "equilateral";
          else if ((angle1 == angle2) || (angle2 == angle3) || (angle3 == angle1))
            triangle = "isosceles";
          if (angle1 == 90 || angle2 == 90 || angle3 == 90)
            triangle += " right";
      }
      else
        {triangle = "invalid";}
      System.out.println("this is a " + triangle + " triangle");

    }
  
    else if (option == 2) //sides
      {
      System.out.println("Enter sides: ");
      int side1 = in.nextInt();
      int side2 = in.nextInt();
      int side3 = in.nextInt();
    
      if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side3 + side1) > side2 && (side1 > 0) && (side2 > 0) &&(side3 > 0)) //checks valid triangle
      {
          if (side1 == side2 && side2 == side3)
            triangle = "equilateral";
          else if ((side1 == side2) || (side2 == side3) || (side3 == side1))
            triangle = "isosceles";
          else 
            triangle = "scalene";
      }
      else
        triangle = "invalid";
    System.out.println("this is a " + triangle + " triangle");

    }
    else //if angle or side isn't chosen properly
        System.out.print("invalid input");
    }
    
}
