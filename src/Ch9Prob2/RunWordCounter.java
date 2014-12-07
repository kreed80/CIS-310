package Ch9Prob2;
import java.util.Scanner;
/**
 *
 * @author kianna
 */
public class RunWordCounter {
    public static void main(String[] args){
        WordCounter wc = new WordCounter();
        String words;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        words = input.nextLine();
        
        System.out.println(wc.getWordCount(words));
    }
        
}
