package Ch8Prob1;
import java.math.*;

/**
 *
 * @author kianna
 */
public class Area {
    private static double area;
    
    public static double getArea(double r){
        area = Math.PI * Math.pow(r, 2);
        return area; 
    }
    
    public static int getArea(int width, int length){
        area = width * length;
        return (int)area;
    }
    
    public static double getArea(double radius, double height){
        area = (Math.PI * Math.pow(radius, 2)) * 2;
        return area;
    }
    
    
}
