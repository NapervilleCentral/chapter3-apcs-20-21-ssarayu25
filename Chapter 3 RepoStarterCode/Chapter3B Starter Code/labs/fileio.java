package labs;
import java.util.Scanner;
import java.io.*;
/**
 * analyze historical speeches
 *
 * sarayu suresh
 * 11/1/21
 */
public class fileio
{
    public static void main (String args[]) throws IOException
    {
        Scanner scan = new Scanner(new File("labs/speeches/jfk.txt"));
        int counter = 0;
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        while (scan.hasNext())
        {
            scan.next();
            counter++;
        }
        System.out.println("Word count: " + counter);
    }
}