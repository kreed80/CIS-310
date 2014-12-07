package Ch11Prob1;
import java.util.Scanner;

/**
 *
 * @author kianna
 */
public class RunTestScores {
    public static void main(String[] args){
        
        int inputCount = 3;
        int[] userScores = new int[inputCount];
        TestScores ts;
         
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < inputCount; i++){
            System.out.println("Please enter no more than 3 test scores: ");
            userScores[i] =  input.nextInt();
        }
        
        ts = new TestScores(userScores);
        
        
        ts.verifyScore();
        
        System.out.println("Your average test score is: " + ts.getAverage());
    }
    
}
