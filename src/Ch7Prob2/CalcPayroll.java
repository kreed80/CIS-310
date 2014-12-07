package Ch7Prob2;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kianna
 */
public class CalcPayroll {
        
    public static void main(String[] args){
        int employees[];
        int id;
        int hours;
        double pay;
        
        Payroll pr = new Payroll();
        employees = Arrays.copyOf(pr.getEmployees(), pr.getEmployees().length);
        
        do{
            System.out.println("Choose a valid ID number: " + employees[0] + " " 
                + employees[1] + " " + employees[2] + " " + employees[3] + " " 
                + employees[4] + " " + employees[5] + " " + employees[6]);
        
            Scanner scId= new Scanner(System.in);
            id = scId.nextInt();
        }while(id != employees[0] && id != employees[1] && id != employees[2] 
                && id != employees[3] && id != employees[4] 
                && id != employees[5] && id != employees[6]);
        
        Scanner scHours = new Scanner(System.in);
        do{
            System.out.println("Please enter positive total amount of hours worked: ");
            hours = scHours.nextInt();
        }while(hours < 0);
        pr.setHours(hours);
        
        
        Scanner scPay = new Scanner(System.in);
        do{
            System.out.println("Please enter your positive rate of pay: ");
            pay = scPay.nextDouble();
        }while(pay < 0);
        pr.setPayRate(pay);
        
        System.out.println("Your gross pay is: " + pr.getWage());
    }
}
