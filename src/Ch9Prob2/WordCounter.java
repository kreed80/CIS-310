package Ch9Prob2;

/**
 *
 * @author kianna
 */
public class WordCounter {
    private int counter;
    
    public WordCounter(){
        
    }
    
    private int wordCount(String input){
        String words[] = input.split(" ");
        counter = words.length;
        return counter;
    }
    
    public int getWordCount(String input){
        wordCount(input);
        return counter;
    }
}

  
