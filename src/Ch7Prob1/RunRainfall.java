package Ch7Prob1;

import java.util.Scanner;

/**
 *
 * @author kianna
 */
public class RunRainfall {
    
    public static void main(String[] args){
        Rainfall rain = new Rainfall();
        double totalRain[] = new double[12];
        double checker;
        Scanner askTotal = new Scanner(System.in);
        for (int i=0; i<12; i++) {
             do{
                 System.out.println("Enter total for month " + (i+1));
                 checker = askTotal.nextDouble();
                 
             }while(checker < 0);
                 totalRain[i] = checker;
        } 
        
        rain.setData(totalRain);
        
        System.out.println("the total rainfall for the year was: " 
                + rain.yearTotal());
        System.out.println("the average rainfall was: " + rain.avgMonth());
        System.out.println("the month with the most rain had: "
                + rain.mostRain());
        System.out.println("the month with the least rain had: "
                + rain.leastRain());
        
    }
}
