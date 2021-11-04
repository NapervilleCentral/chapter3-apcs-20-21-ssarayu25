package labs;
import java.util.Scanner;
import java.io.*;
/**
 * file i/o program
 * analyze historical speeches
 * sarayu suresh
 * 11/1/21
 */
public class fileio
{
    public static void main (String args[]) throws IOException
    {
        //Scanner scan = new Scanner(new File("labs/speeches/jfk.txt"));
        //Scanner scan = new Scanner(new File ("labs/speeches/gwbush.txt"));
        //Scanner scan = new Scanner(new File ("labs/speeches/fillmore.txt"));
        //Scanner scan = new Scanner(new File ("labs/speeches/taft.txt"));
        //Scanner scan = new Scanner(new File ("labs/speeches/tjefferson.txt"));
        //Scanner scan = new Scanner(new File ("labs/speeches/tjefferson.txt"));
        Scanner scan = new Scanner(new File ("labs/speeches/Jadams inaugural speech.txt"));

        
        float counter = 0; // number of times that counter is referenced
        float people = 0; //number of times that people is referenced
        float united = 0; //number of times that united is referenced
        float government = 0; //number of times that government is referenced
        float our = 0; //number of times our is referenced 
        float letters = 0; //word length
        
        System.out.println(scan.nextLine()); //grabs and prints year
        System.out.println(scan.nextLine()); //grabs and prints speaker
        
        while (scan.hasNext()) 
        {
            String word = scan.next(); //moves iterator
            
            //tests for different word (checks both capitalized and lowercase)
            if (word.equals("people")|| word.equals("People"))
                people++;
            else if (word.equals("united") || word.equals("United"))
                united++;
            else if (word.equals("government") || word.equals("Government"))
                government++;
            else if (word.equals("our")|| word.equals("our"))
                our++;
            letters += word.length();
            counter++; //word count
        }
        
        System.out.println("Word count: " + counter);
        System.out.println("Average word length: " + (letters / counter));
        System.out.println();
        
        //prints number of times the word appears then the percent of the speech that was that word
        System.out.println("People: " + people + "\t\t" + ((people/counter) * 100) + "%"); 
        System.out.println("United: " + united + "\t\t" + ((united/counter) * 100) + "%");
        System.out.println("Government: " + government + "\t\t" + ((government/counter) * 100 + "%"));
        System.out.println("Our: " + our + "\t\t" + ((our/counter) * 100) + "%");
        
    
    }
}
/* My Results
Modern

1961
John F. Kennedy
Word count: 1341.0
Average word length: 4.607755

People: 1.0		0.074571215%
United: 1.0		0.074571215%
Government: 0.0		0.0%
Our: 21.0		1.5659955%

2001
George W. Bush
Word count: 1585.0
Average word length: 4.659306

People: 0.0		0.0%
United: 2.0		0.12618296%
Government: 3.0		0.18927445%
Our: 46.0		2.9022083%


1830-1920

1850
Millard Filmore

Word count: 8318.0
Average word length: 4.9775186

People: 4.0		0.048088484%
United: 24.0		0.28853092%
Government: 39.0		0.4688627%
Our: 47.0		0.5650397%


1909
William Howard Taft
Word count: 5431.0
Average word length: 4.918063

People: 5.0		0.092064075%
United: 6.0		0.110476896%
Government: 19.0		0.3498435%
Our: 37.0		0.6812742%



1776 – 1830

1801
Thomas Jefferson
Word count: 1726.0
Average word length: 4.876593

People: 1.0		0.057937425%
United: 0.0		0.0%
Government: 7.0		0.40556198%
Our: 24.0		1.3904983%

Inaugural Address (March 4, 1797)
John Adams
Word count: 2317.0
Average word length: 4.9823046

People: 12.0		0.5179111%
United: 3.0		0.12947777%
Government: 11.0		0.47475183%
Our: 6.0			0.25895554%
 */