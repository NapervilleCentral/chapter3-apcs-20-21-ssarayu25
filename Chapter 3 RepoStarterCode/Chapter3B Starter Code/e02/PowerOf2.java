package e02;

public class PowerOf2
{
   public static void main(String[] args)
   {
      // The powers of 2 from 2^0 to 2^20

      double answer;
     
      for(double power = 0; power <= 20; power++)
      {
          answer = Math.pow(2, power);
          System.out.println("2^" + power + " = " + answer);
      }
   }
}