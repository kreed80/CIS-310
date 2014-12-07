/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch10Prob1;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Kianna Reed
 */
public class RunSupervisor {
    
    public static void main(String[] args) throws ParseException{      
        ShiftSupervisor john = new ShiftSupervisor("John", "111-j", 
                "12/12/1980", 45000.00, 645.04);    
        ProductionWorker larry = new ProductionWorker("Larry", "111-j", 
                "12/24/1980", 1, 24.90);
        
        System.out.println("Avaialable Employees: " + john.getEmpName() 
                + ", " + larry.getEmpName());
        
        System.out.println("Enter the name of an available employee: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        
        if(name.toLowerCase().equals(john.getEmpName().toLowerCase())){
            System.out.println("John is a Shift Supervisor" +" "
                    + john.getEmpNum() +" "+ 
                    john.getHireDate() +" "+ john.getSalary() +" "+
                    john.getBonus());
        }else if(name.toLowerCase().equals(larry.getEmpName().toLowerCase())){
            System.out.println("Larry is a Production Worker"  +" "
                    + larry.getEmpNum() +" "+ larry.getHireDate() +" "
                    + larry.getShift() +" "+ larry.getPayRate());
        }else{
            System.out.println("Invalid Employee Name");
        }
    }
    
}
