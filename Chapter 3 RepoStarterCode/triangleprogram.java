import java.util.Scanner;
/**
 * Sarayu Suresh
 * 9/21/21
 * triangleprogram
 * Given the lengths of three sides of a triangle, print whether the triangle is scalene, isosceles, or equilateral.
 */
public class triangleprogram
{
    public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String triangle = "";
      
      System.out.println("Do you want to enter angles or sides");
      System.out.println("For angles, enter 1");
      System.out.println("For sides, enter 2");
      int option = in.nextInt();
      
    if (option == 1)
      {
      System.out.println("Enter angles: ");
      int angle1 = in.nextInt();
      int angle2 = in.nextInt();
      int angle3 = in.nextInt();
    
      if (((angle1 + angle2 + angle3) == 180) && (angle1 != 0) && (angle2 != 0) && (angle3 != 0))
      {
          if (angle1 == angle2 && angle2 == angle3)
            triangle = "equilateral";
          else if ((angle1 == angle2) || (angle2 == angle3) || (angle3 == angle1))
            triangle = "isosceles";
          else 
            triangle = "scalene";
      }
      else
        triangle = "invalid";
    }
  
    else if (option == 2)
      {
      System.out.println("Enter sides: ");
      int side1 = in.nextInt();
      int side2 = in.nextInt();
      int side3 = in.nextInt();
    
      if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side3 + side1) > side2)
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
    }
    else
        System.out.print("invalid input");
    System.out.println("this is a " + triangle + " triangle");
    }
    
}
