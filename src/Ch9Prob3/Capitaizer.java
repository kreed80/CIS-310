package Ch9Prob3;


/**
 *
 * @author kianna
 */
public class Capitaizer {
    private String str;   
    private char[] text = null;
    private boolean capitalize = true;
    private boolean spacefound = true;
    

    public Capitaizer(){
        text = str.toCharArray();
    }
    
    private void firstLetter(){
        for(int i = 0; i < text.length; i++){
            if (capitalize){
                if (text[i] == ' ')
                {
                    spacefound = true;
                }
                else
                {
                    if (spacefound && !Character.isUpperCase(text[i]))
                    {
                        text[i] = Character.toUpperCase(text[i]);
                    }
                    capitalize = false;
                    spacefound = false;
                }
            }
            else
            {
                if (text[i] == '.' || text[i] == '?' || text[i] == '!')
                {
                    capitalize = true;
                }
            }
        }
    }
    
    public String getCapital(String sentence){
        firstLetter();
        return str;
    }
}
