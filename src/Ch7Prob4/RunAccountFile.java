package Ch7Prob4;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author kianna
 */
public class RunAccountFile {
    public static void main(String[] args){
        String userInput;
        int numElement;

        AccountFile af = new AccountFile();

        Scanner afInput = new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        userInput = afInput.next();


        numElement = af.findAccount(userInput);
        
       if(numElement != -1){
            System.out.println("Your account number is valid.");
        }
       else{
            System.out.println("Your account number is invalid.");
            }
    }
    
}
