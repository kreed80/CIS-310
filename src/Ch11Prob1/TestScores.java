
package Ch11Prob1;

/**
 *
 * @author kianna
 */
public class TestScores {
    private int[] scores = new int [3];
    private int sum = 0;
    private int avg = 0;
    
    public TestScores(int testScores[]){
        for(int i = 0; i < testScores.length; i++){
            scores[i] = testScores[i];
        }
    }
    
    public void verifyScore(){
        for(int i = 0; i < scores.length; i++)
        if(scores[i] < 0 || scores[i] > 100){
            throw new IllegalArgumentException("Test score cannot exceed 100");
            
        }
    }
    
    private int sum(){
        for(int i = 0; i < scores.length; i++){
            sum = sum + scores[i];
        }
        return sum;
    }
    
    public int getAverage(){
      sum();
      avg = sum / 3;
      return avg;
    }
 }
