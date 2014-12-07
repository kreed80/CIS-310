package Ch11Prob2;

/**
 *
 * @author kianna
 */

public class InvalidTestScores
                extends Exception
{
    public InvalidTestScores(){
        super("Error: The test scores are invalid.");
    }
    
    public InvalidTestScores(int score){
        super("Error: The following test score is invalid: " + score);
    }
}
