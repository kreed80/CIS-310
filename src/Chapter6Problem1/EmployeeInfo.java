/*
 * Input employee information to run with Employee class
 */
package Chapter6Problem1;

/**
 *
 * @author kianna
 */
public class EmployeeInfo {
    public static void main(String[] args){
        //create Susan
        Employee susan = new Employee();
        makeEmp(susan, "Susan Meyers", 47899, "Accounting", "Vice President");
       
        //create Mark
        Employee mark = new Employee();
        makeEmp(mark, "Mark Jones", 39119, "IT", "Programmer");
       
        //create Joy
        Employee joy = new Employee();
        makeEmp(joy, "Joy Rogers", 81774, "Manufacturing", "Engineer");
    }
    
    private static void makeEmp(Employee emp, String name, int id, 
            String department, String position)
    {
        emp.setName(name);
        emp.setIdNumber(id);
        emp.setDepartment(department);
        emp.setPosition(position);
        
        System.out.println(emp.getName() + " " + emp.getIdNumber() + " " 
                + emp.getDepartment() + " " + emp.getPosition());
    }
    
}
