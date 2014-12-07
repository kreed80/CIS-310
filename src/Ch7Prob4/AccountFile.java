package Ch7Prob4;

import java.io.*;
import java.util.*;

/**
 *
 * @author kianna
 */

public class AccountFile {
    final int SIZE = 18;
    int iterator = 0;
    ArrayList<String> acctNums = new ArrayList<String>(); 
    
    public AccountFile(){
        loadFile();
    }
    
    private void loadFile(){
        File file = new File("file.txt");
        
        try (Scanner inputFile = new Scanner(file);){
            while(inputFile.hasNext() &&  iterator < SIZE){
                acctNums.add(String.valueOf(inputFile.nextInt()));
                iterator++;
            }
            inputFile.close();
        } catch (FileNotFoundException e){
            System.out.println("File not loaded. " + e);
        }
    }
    public int findAccount(String userAcct){
    int numIndex = 0;
    int numElement = -1;
    boolean numFound = false;
    String acctInt = String.valueOf(userAcct);
    
    while(!numFound && numIndex < acctNums.size()){
        if (acctNums.get(numIndex).equals(acctInt)){
            numFound = true;
            numElement = numIndex;
        }
        numIndex++;    
    }
    return numElement;
   }
}