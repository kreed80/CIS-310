package Ch10Prob1;

/**
 *
 * @author kianna
 */
public class ShiftSupervisor extends Employee{
    private double salary;
    private double bonus;
    
    public ShiftSupervisor(String name, String empID, String startDate, double sal, double bon){
        super(name, empID, startDate);
        salary = sal;
        bonus = bon;
    }
    public ShiftSupervisor(){
        
    }
    
    public void setSalary(String s){
        salary = Double.parseDouble(s);
    }
    
    public void setSalary(Double s){
        salary = s;
    }
    
    public double getSalary(){
        return salary;
    }
   
    public void setBonus(String b){
        bonus = Double.parseDouble(b);
    }
    
    public void setBonus(Double b){
        bonus = b;
    }
    
    public double getBonus(){
        return bonus;
    }
}
