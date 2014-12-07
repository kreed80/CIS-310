package Ch9Prob4;

import java.util.Scanner;

/**
 *
 * @author kianna
 */
public class VowelsAndConsanants {
    //field initiatiation
    private int countVowels = 0;
    private int countConsanants = 0;
    private String text;
    
    //Create constructor that takes a String argument
    public VowelsAndConsanants(){
   }
   //Create a method that counts the vowels in a string
    public void parseInput(String input){
        text = input.toUpperCase();
        
        for(int i = 0; i < input.length(); i++){
            switch(text.charAt(i)){
                case 'A':
                    countVowels++;
                    break;
                case 'E':
                    countVowels++;
                    break;
                case 'I':
                    countVowels++;
                    break;
                case 'O':
                    countVowels++;
                    break;
                case 'U':
                    countVowels++;
                    break;
                default:
                    countConsanants++;
                    break;
               
            }
            
        }        
     }
    //Create a method that counts the consanants in a string
    public int getCons(){
       return countConsanants;
    }
    
    public int getVowel(){
       return countVowels;
    }
   
}

