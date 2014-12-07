package Chapter3;

import java.util.Scanner;
/*
 * Prompt user to enter a number of seconds and convert the number into minutes, 
    hours or days.
 */

/**
 *
 * @author kianna
 */
public class Problem6 
{
    public static void main(String[] args)
    {
        //Create variables
        double input;
        double minutes = 60;
        double hours = 3600;
        double days = 86400;
        
        //Create Scanner and prompt user for seconds
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter a number of seconds to be converted. ");
        input = keyboard.nextDouble();
        
        //Convert seconds to minutes, hours and days
        double inputMin = input / minutes;
        double inputHour = input / hours;
        double inputDays = input / days;
        
        if(input > 0 && input <= hours)
        {
            System.out.println("The number of minutes in that amount of "
                    + "seconds are " + String.format("%.2f", inputMin) + ".");
        }  
        if(input > hours && input <= days)
        {
            System.out.println("The amount of hours in that many seconds are "
                                + String.format("%.2f", inputHour) + ".");
        }
        if(input > days)
        {
            System.out.print("The amount of days in that may seconds are "
                                + String.format("%.2f", inputDays) + ".");
        }
    System.exit(0);
    }        
}
