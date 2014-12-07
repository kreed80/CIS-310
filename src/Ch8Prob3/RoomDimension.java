package Ch8Prob3;

/**
 *
 * @author kianna
 */
public class RoomDimension {
    private double length;
    private double width;
    private double area;
    
    public void setRD(double l, double w){
      length = l;
      width = w;
    }
    public double getArea(){
        area = length * width;
        return area;
    }
}
