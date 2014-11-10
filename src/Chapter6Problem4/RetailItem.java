/*
 * Class to hold data about items in a retail store
 */
package Chapter6Problem4;

/**
 *
 * @author kianna
 */
public class RetailItem {
    
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
