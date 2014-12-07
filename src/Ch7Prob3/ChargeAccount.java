package Ch7Prob3;
import java.util.*;

/**
 *
 * @author kianna
 */
public class ChargeAccount {
    
    ArrayList<String> acctNums = new ArrayList<String>(); 
    public ChargeAccount(){
        acctNums.add("5658845");
        acctNums.add("8080152");
        acctNums.add("1005231");
        acctNums.add("4520125");
        acctNums.add("4562555");
        acctNums.add("6545231");
        acctNums.add("7895122");
        acctNums.add("5552012");
        acctNums.add("3852085");
        acctNums.add("8777541");
        acctNums.add("5050552");
        acctNums.add("7576651");
        acctNums.add("8451277");
        acctNums.add("7825877");
        acctNums.add("7881200");
        acctNums.add("1302850");
        acctNums.add("1250255");
        acctNums.add("4581002");
    }
   
   
   public int findAccount(String userAcct){
    int numIndex = 0;
    int numElement = -1;
    boolean numFound = false;
    String acctInt = String.valueOf(userAcct);
    
    while(!numFound && numIndex < acctNums.size()){
        if (acctNums.get(numIndex).equals(acctInt)){
            numFound = true;
            numElement = numIndex;
        }
        numIndex++;    
    }
    return numElement;
   }
       
}
