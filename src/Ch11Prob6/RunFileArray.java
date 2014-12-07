/*
 *  Demonstrate program for FileArray;
 */
package Ch11Prob6;

import java.io.*;
import java.util.*;

/**
 *
 * @author kianna
 */
public class RunFileArray {
    public static void main(String[] args) throws IOException{
        String fn = "FileArrayTester";
        int[] outArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> inArray = new ArrayList<Integer>(); 
        
        FileArray fa = new FileArray();
        
        fa.writeArray(fn, outArray);
        
        inArray = fa.readArray(fn);
        
        for(int i = 0; i < inArray.size(); i++){
            System.out.print(inArray.get(i) + " ");
        }
        System.out.print("\n");
        
    }
    
}
