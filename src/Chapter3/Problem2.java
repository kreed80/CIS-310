package Chapter3;
/*
 * user inputs a date to see if the date is "magical"
 * if it is, program outputs message that says date is not magical
 * if it is, program displays message that says it's magical.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author kianna
 */
public class Problem2 
{
    public static void main(String[] args)
    {
        //Declare variables
        int month;
        int date;
        int year;
        int totalDate;
        String input;
        
        //Get 2 digit month, date and year from user and verify
       
         do {
            input = JOptionPane.showInputDialog(null, "Please enter a 2 digit birth month");
            month = Integer.parseInt(input);
         } while (month < 0 || month >= 12);
         
         do {
            input = JOptionPane.showInputDialog(null, "Please enter a 2 digit birth date");
            date = Integer.parseInt(input);
         } while (date < 0 || date >= 31);
         
         do {
            input = JOptionPane.showInputDialog(null, "Please enter a 2 digit birth year");
            year = Integer.parseInt(input);
         } while (year < 0 || year >= 99);
       
         //Calculate date input 
        totalDate = month * date;

       //Check to see if magic date
        if (totalDate == year)
        {
            JOptionPane.showMessageDialog(null, "You have a magical birthdate!");
        }    
        else
        {
            JOptionPane.showMessageDialog(null, "You do not have a magical birthdate.");
        }
    System.exit(0);    
    }
}
