/*
 * Throw exception when a negative price is entered.
 */
package Ch11Prob3;

/**
 *
 * @author kianna
 */
public class NegativePriceException 
                      extends Exception
{
    public NegativePriceException(){
        super("Error: The price cannot be negative.");
    }
    
    public NegativePriceException(double price){
        super("Error: The following negative price is invalid: " + price);
    }
}

