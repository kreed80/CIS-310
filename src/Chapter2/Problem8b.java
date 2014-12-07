package Chapter2;
/*
 *Program will ask a user to input a purchase price
then it will compute the state and county sales tax.
 */
import java.util.Scanner;
/**
 *
 * @author kianna
 */
public class Problem8b 
{
    public static void main(String[] args)
    {
        double salesPrice;
        double salesTotal;
        double taxState;
        double taxCounty;
        double stateTaxTotal;
        double countyTaxTotal;
        double taxTotal;
        
        taxState = 0.04;
        taxCounty = 0.02;
       
        //Get user's purchase price
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter your purchase price.");
        salesPrice = keyboard.nextDouble();
        
        //Calculate sales tax
        stateTaxTotal = salesPrice * taxState;
        countyTaxTotal = salesPrice * taxCounty;
        taxTotal = stateTaxTotal + countyTaxTotal;
        
        //Calculate total sales price including tax
        salesTotal = salesPrice + taxTotal;
        
        //Display information
        System.out.println("Your state sales tax is " + String.format("%.2f",stateTaxTotal) + ".");
        System.out.println("Your county sales tax is " + String.format("%.2f",countyTaxTotal) + ".");
        System.out.println("Your total sales tax is " + String.format("%.2f",taxTotal) + ".");
        System.out.print("Your sales total including tax is " + String.format("%.2f",salesTotal) + ".");    
    }
}

