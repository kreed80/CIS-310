package Ch7Prob2;

/**
 *
 * @author kianna
 */
public class Payroll {
    final int employeeId[] = {5658845, 4520125, 7895122, 8777541, 8451277,
                                 1302850, 7580489};
    final int[] hours = new int[7];
    final double[] payRate = new double[7];
    final double[] wages = new double[7];
    private int empNum;
    
    public int[] getEmployees(){
        return employeeId;
    }
    private void findEmp(int i){
        for(int j=0; j<employeeId.length; j++){
            if(i == employeeId[j]){
                empNum = j;
            }
        }
    }
    public void setHours(int empHours){
        hours[empNum] = empHours;
    }
    
    public void setPayRate(double empPay){
        payRate[empNum] = empPay;
    }
    
    private void calcWage(){
        wages[empNum] = payRate[empNum] * hours[empNum];
    }
    public double getWage(){
        findEmp(empNum);
        calcWage();
        return wages[empNum];
    }

    
    
}
