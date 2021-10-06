//Sarayu Suresh
//planetprogram
//calculates user's weight in different planets
//9/24/21
import java.text.DecimalFormat;
import java.util.Scanner;
public class planetprogram
{
        public static void main (String[] args)
   {
            Scanner Keyboard = new Scanner(System.in);
            DecimalFormat fmt = new DecimalFormat("#.##");
            int choice;
            float weight;

           
           System.out.println("Enter weight");
           weight = Keyboard.nextFloat();
           
           
            System.out.println("Menu");
            System.out.println("1) Mercury");
            System.out.println("2) Venus");
            System.out.println("3) Earth");
            System.out.println("4) Mars");
            System.out.println("5) Jupiter");
            System.out.println("6) Saturn");
            System.out.println("7) Uranus");
            System.out.println("8) Neptune");
            System.out.println("9) Pluto");
            int error = 0;
            
            
            
            choice = Keyboard.nextInt();
            
            //switch can use char, int, and String
            //a switch finds true and cascades: finds the true, and executes everything below
            //break will stop cascade
            switch (choice) 
            {
                case 1: 
                    weight *= 0.38; 
                    break;
                case 2: 
                    weight *= 0.91; 
                    break;
                case 3:
                    weight *= 1;
                    break;
                case 4:
                    weight *= 0.38;
                    break;
                case 5:
                    weight *= 2.34;
                    break;
                case 6:
                    weight *= 1.06;
                    break;
                case 7:
                    weight *= 0.92;
                    break;
                case 8:
                    weight *=1.19;
                    break;
                case 9:
                    weight *= 0.06;
                    break;
                default: 
                    System.out.print("Error: Not a Planet");
                    error = 1;
                


                }
                if (error == 1)
                    System.out.println("You will weigh " + fmt.format(weight));
                
    }
}