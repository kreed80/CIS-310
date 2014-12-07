package Ch9Prob1;

import java.util.Scanner;
/**
 *
 * @author kianna
 */
public class RunBackwards {
    public static void main(String[] args){
        Backwards bw = new Backwards();
        String userString;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter what you want reversed:  ");
        userString = input.nextLine();
        
        
        System.out.println(bw.getReverse(userString));
   }
    
}
