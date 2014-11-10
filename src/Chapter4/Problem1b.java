import java.util.Scanner;
/*
 * Ask user to input an integer and program adds the preceding numbers
    starting at 0.
 */
package Chapter4;

/**
 *
 * @author kianna
 */
public class Problem1 
{
    public static void main(String[] args)
    {
        //Declare variables
        int input;
        int total = 0;
     
        
        //Create Scanner and Prompt user to enter a number up to 50
        Scanner keyboard = new Scanner(System.in);
        
        do
        {
            System.out.print("Please enter number between 1 - 50. ");
            input = keyboard.nextInt();
        }    
        while(input < 1 || input > 50);
        
        //Begin counting the numbers and display answer.
        for( int count = 1; count <= input; count++)
        {
            total += count;
        }   
         System.out.println("The final total is " + total);
         
     System.exit(0);
    }
}
