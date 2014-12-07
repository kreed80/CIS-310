/*
 * Throw exception when a negative unit amount is entered.
 */
package Ch11Prob3;

/**
 *
 * @author kianna
 */
public class NegativeUnitsException 
                      extends Exception
{
    public NegativeUnitsException(){
        super("Error: The amount of units cannot be negative.");
    }
    
    public NegativeUnitsException(int units){
        super("Error: The following negative unit amount is invalid: " + units);
    }
}

