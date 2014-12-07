package Ch10Prob1;

/**
 *
 * @author kianna
 */
public class ProductionWorker extends Employee{
    private int shift;
    private double payRate;
    
    public ProductionWorker(String name, String empID, String startDate, int sh, double rate){
        super(name, empID, startDate);
        shift = sh;
        payRate = rate;
    }
    public ProductionWorker(){
        
    }
    
    public void setShift(String sh){
        shift = Integer.parseInt(sh);
    }
    
    public int getShift(){
        return shift;
    }
   
    public void setPayRate(String rate){
        payRate = Double.parseDouble(rate);
    }
    
    public double getPayRate(){
        return payRate;
    }
}
