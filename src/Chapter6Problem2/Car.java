/*
 * Create a program that accelorates 5 miles to the speed for each iteration and 
decreases 5 miles after each additional iteration for 5 times each.
 */
package Chapter6Problem2;

/**
 *
 * @author kianna
 */
public class Car
{
    private int yearModel;
    private String make;
    private int speed = 0;
    
    public Car(int carYear, String carMake){
        yearModel = carYear;
        make = carMake;
        speed = 0;
    }
    
    public int getYearModel(){
        return yearModel;
    }
    
    public String getMake(){
        return make;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void accelerate(){
        speed = speed + 5;
    }
    
    public void brake(){
        speed = speed - 5;
    }
}
