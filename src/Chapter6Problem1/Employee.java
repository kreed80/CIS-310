/*
 * Class that stores and assigns Employee information
 */
package Chapter6Problem1;

/**
 *
 * @author kianna
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
   //Make constructors displaying three different methods
    
    public Employee(String empName, int empID, String dept, String empPos){
        name = empName;
        idNumber = empID;
        department = dept;
        position = empPos;      
   }
    public Employee(String empName, int empID){
        department = "";
        position = "";
    }
    
    public Employee(){
        name = "";
        department = "";
        position = "";
        idNumber = 0;
    }
    
   //Make mutators for each variable
    public void setName(String empName){
        name = empName;
   }
    
    public void setIdNumber(int empID){
        idNumber = empID;
    }
    
    public void setDepartment(String dept){
        department = dept;
    }
    
    public void setPosition(String empPos){
        position = empPos;
    }
   //Make accessors for each variable 
    public String getName(){
        return name;
    }
    public int getIdNumber(){
        return idNumber;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }
}
