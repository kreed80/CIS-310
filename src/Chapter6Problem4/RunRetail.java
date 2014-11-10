/*
 *Run RetailItem class
 */
package Chapter6Problem4;

/**
 *
 * @author kianna
 */
public class RunRetail {
    
    public static void main(String[] args){
        
        RetailItem jacket = new RetailItem();
        makeRetail(jacket, "Jacket", 12, 59.95);
        
        RetailItem jeans = new RetailItem();
        makeRetail(jeans, "Designer Jeans", 40, 34.95);
        
        RetailItem shirt = new RetailItem();
        makeRetail(shirt, "Shirt", 20, 24.95);
        
    }
    private static void makeRetail(RetailItem retail, String description, int 
            unitsOnHand, double price){
        retail.setDescription(description);
        retail.setUnitsOnHand(unitsOnHand);
        retail.setPrice(price);
        
        System.out.println(retail.getDescription() + " "
                + retail.getUnitsOnHand() + " " + retail.getPrice());
    }
}
