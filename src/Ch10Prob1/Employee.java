package Ch10Prob1;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import static javafx.scene.input.KeyCode.M;

/**
 *
 * @author kianna
 */
public class Employee {

    
    private String empName;
    private String empNum;
    private String hireDate;
    private String input;
    
    public Employee(String name, String number, String date){
        empName = name;
        empNum =  number;
        hireDate = date;
    }
    
    public Employee(){
       empName = "";
       empNum = "";
       hireDate = "";
    }
    
    public void setEmpName(String name){
        empName = name;
    }
    
    public void setEmpNum(String id){
        empNum = id;
    }
    
    public void setHireDate(String date){
        hireDate = date;
    }
    
    public String getEmpName(){
        return empName;
    }
    
    public String asDate(String str){
        return str;
    }
    public Date getHireDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse(hireDate);
        return d;
    }
     
    public String getEmpNum(){
        
        return empNum;
    }
}
