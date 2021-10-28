import java.util.Scanner;
/**
 * prints fibinacci pattern
 * sarayu suresh
 * 10/28/21
 */
public class fibonacci
{
    public static void main (String args[])
    {
        int num1 = 0;
        int num2 = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number, and that many numbers of the fibinacci sequence will print: ");
        int input = scan.nextInt();
        
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        for (int i = 0; i < (input - 2); i++)
        {
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + " ");
         
        }
    }   
}
