package Ch8Prob3;

/**
 *
 * @author kianna
 */
public class RoomCarpet {
    private double cost;
    public RoomDimension rd = new RoomDimension();
    private double totalCost;
    
    public void setRC(double c, RoomDimension dim){
        cost = c;
        rd = dim;
    }
    
    public double getTotalCost(){
        totalCost = rd.getArea() * cost;
        return totalCost;
    }
    
}
