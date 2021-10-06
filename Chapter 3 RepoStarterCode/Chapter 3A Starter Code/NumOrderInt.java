import java.util.Scanner;

public class NumOrderInt
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
   
      System.out.print("Enter three numbers: ");
     
      int one = in.nextInt();
      int two = in.nextInt();
      int three = in.nextInt();
     
      if ((one<two && two<three) ||  (three<two && two<one))
        System.out.println("In order");
      else
        System.out.println("Not in order");
}
   }