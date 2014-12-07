package Ch9Prob3;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author kianna
 */
public class RunCapitalizer {
    public static void main(String[] args){
        Capitaizer cp = new Capitaizer();
        String inputText;
        
      
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        inputText = input.nextLine();
        
        System.out.println(cp.getCapital(inputText));
    }
}
