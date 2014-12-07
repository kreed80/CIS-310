/*
 * writes an array to file and reads file.
 */
package Ch11Prob6;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author kianna
 */
public class FileArray {
    public static void writeArray(String fn, int[] ar) 
            throws FileNotFoundException, IOException{
        writeFile(fn, ar);
    }
    
    public static ArrayList<Integer> readArray(String fn) throws IOException{
        boolean EOF = false;
        int number;
        
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        DataInputStream inputFile = 
                new DataInputStream(new FileInputStream(fn));
        
        for(int i = 0; !EOF; i++){
            try{
                number = inputFile.readInt();
                ar.add(number);
            }
            catch(EOFException e){
                EOF = true;
            }
        }
        inputFile.close();
        return ar;
    }
    
    private static void writeFile(String fn, int[] ar) 
            throws FileNotFoundException, IOException{
        //open as binary file;
        FileOutputStream fstream = new FileOutputStream(fn);
        DataOutputStream outputFile = new DataOutputStream(fstream);
        
        for(int i = 0; i < ar.length; i++){
            outputFile.writeInt(ar[i]);   
        }
        outputFile.close();
    }
    
}
