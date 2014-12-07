package Ch11Prob3;
/*
 * Class to hold data about items in a retail store
 */

/**
 *
 * @author kianna
 */
public class RetailItem{
    private String description;
    private int unitsOnHand;
    private double price;
    
    public RetailItem(){
        description = "";
        unitsOnHand = 0;
        price = 0.00;
    }
    
    public void setDescription(String itemDesc){
        description = itemDesc;
    }
    public void setUnitsOnHand(int unitsAvail){
        unitsOnHand = unitsAvail;
    }
    public void setPrice(double itemPrice){
        price = itemPrice;
    }
    
    public void verifyPrice(double itemPrice)
            throws NegativePriceException
    {
        if(itemPrice < 0){
            throw new NegativePriceException(itemPrice);
        }
    }
     
    public void verifyUnits(int itemUnits)
            throws NegativeUnitsException
    {
        if(itemUnits < 0){
            throw new NegativeUnitsException(itemUnits);
        }
    }
    
    public String getDescription(){
        return description;
    }
    public int getUnitsOnHand(){
        return unitsOnHand;
    }
    public double getPrice(){
        return price;
    }
}

    
