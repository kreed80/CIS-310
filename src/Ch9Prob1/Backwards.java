package Ch9Prob1;

/**
 *
 * @author kianna
 */
public class Backwards {
    private  String rev;
   
    public Backwards(){
    }

    private void inputRev(String input){
       rev = new StringBuffer(input).reverse().toString();
   }
   
    public String getReverse(String input){
        inputRev(input);
        return rev;
    }
}
