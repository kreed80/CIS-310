import java.util.Scanner;
/* Prompt user to enter a string and a letter, program will count and
    display the amount of times the character is in the string.

 */
package Chapter4;

/**
 *
 * @author kianna
 */
public class Problem5 
{
    public static void main(String[] args)
    {
        //Declare variables
        String input1;
        String input2;
        int total = 0;
        
        //Create Scanner and prompt user to enter a string
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter text here");
        input1 = keyboard.nextLine();
        
        System.out.println("Enter a letter");
        input2 = keyboard.nextLine();
        for(int i = 0; i < input1.length(); i++)
        {
             
            if(input1.charAt(i) == input2.charAt(0))
            {
                total++;
            }    
        }
        System.out.println(total);
    
        System.exit(0);
    }
}
