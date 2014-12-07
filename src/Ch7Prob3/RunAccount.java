package Ch7Prob3;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author kianna
 */
public class RunAccount {
    public static void main(String[] args){
       String userInput;
        int numElement;
        
        ChargeAccount ca = new ChargeAccount();
        
        Scanner caInput = new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        userInput = caInput.next();
        
        
        numElement = ca.findAccount(userInput);
        
       if(numElement != -1){
            System.out.println("Your account number is valid.");
        }
       else{
            System.out.println("Your account number is invalid.");
            }
    }
    
}
