
/**
 * monty hallparadox
 * Your task is to simulate this game show. In each iteration, randomly pick a door number between 1 and 3 for placing the car.
 * Randomly have the player pick a door.
 * Randomly have the game show host pick a door having a goat (but not the door that the player picked).
 * Increments a counter for strategy 1 if the player wins by switching to the third door, and increment a counter for strategy
 * 2 if the player wins by sticking with the original choice.
 * Run 1,000 iterations an print both counters.
 *
 * Sarayu Suresh
 *10/21/21
 */
import java.util.Random;

public class montyhallparadox
{
    public static void main (String args[])
    {
        Random generator = new Random();
        int car; //door with car
        int player; // door player chose
        int monty; // door monty chose
        int a; //counter for method A (player stays with the same door)
        int b; //counter for method B (player switches
        
        for (int i = 1; i <=1000; i++) // for loop that runs 1000 times
        {
            //generating numbers between 1-3
            car = generator.nextInt(4)-1;
            player = generator.nextInt(4)-1;
            
            //choosing which door monty opens
            //cannot be the smae as the one with the car, and can't be the same as the one the player chosee
            if (car!=1 && car!=1)
                monty = 1;
            else if (car!=2 && car!=2)
                monty = 2;
            else if (car!=3 && car!=3)
                monty = 3;
            
            //method a player stays with the same door
            
            if (car == player)
                {}
          
        }
        
}
}
