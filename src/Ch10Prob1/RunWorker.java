package Ch10Prob1;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.util.Date;
import static javafx.scene.input.KeyCode.M;
/**
 *
 * @author kianna
 */
public class RunWorker {
    public static void main(String[] args) throws ParseException{
        String input;
        String name;
        String date = "";
        boolean dateIsFormatted = false;
        boolean idIsFormatted = false;
        boolean shiftFormatted = false;
        boolean payFormatted = false;
        String id = "";
        String shift;
        String pay;
        
        ProductionWorker emp = new ProductionWorker();
        
        name = JOptionPane.showInputDialog("What is the Employee's name?");
        
        do{
            date = JOptionPane.showInputDialog("Enter your hire date"
                + " in mm/dd/yyyy format.");
            
            //validate date string
            if(date.length() == 10){
                for(int i=0; i<10; i++){
                    dateIsFormatted = false;
                    char tmpDate = date.charAt(i);
                    if(Character.isDigit(tmpDate) && i != 2 && i != 5){
                        dateIsFormatted = true;
                    }else if(date.charAt(i) == '/'){
                        dateIsFormatted = true;
                    }else{
                        //do nothing
                    }
                }
            }
        }while(!dateIsFormatted);

        do{
            id = JOptionPane.showInputDialog("Please enter your employee Id: ");
            
            //validate id string
            
            if(id.length() == 5){
                for(int i=0; i<5; i++){
                    idIsFormatted = false;
                    char tmpChar = id.charAt(i);
                    if(Character.isDigit(tmpChar) && i != 3 && i != 4){
                        idIsFormatted = true;
                    }else if(id.charAt(i) == '-' && i == 3){
                        idIsFormatted = true;
                    }else if(Character.isLetter(tmpChar) && i == 4 
                            && Character.toUpperCase(tmpChar) >= 'A' 
                            && Character.toUpperCase(tmpChar) <= 'M'){
                        idIsFormatted = true;
                    }else{
                        //System.out.println(idIsFormatted);
                    }
                }
            }
            
        }while(!idIsFormatted);
        
        do{
            shift = JOptionPane.showInputDialog("Please enter the shift: ");
            if(shift.charAt(0) == '1' || shift.charAt(0) == '2'){
                shiftFormatted = true;
            }
        }while(!shiftFormatted);
        
        do{
            pay = JOptionPane.showInputDialog(
                    "Please enter the pay rate: ");
            if(Double.parseDouble(pay) > 0){
                payFormatted = true;
            }else{
                payFormatted = false;
            }
        }while(!payFormatted);
        
        emp.setHireDate(date);
        emp.setEmpName(name);
        emp.setEmpNum(id);
        emp.setPayRate(pay);
        emp.setShift(shift);
        
        System.out.println(emp.getEmpName() + " " + emp.getEmpNum() + " " 
                + emp.getHireDate() + " " + emp.getPayRate() + " " 
                + emp.getShift());
                
        
        
        
        
        
        
        
    }
    
}
