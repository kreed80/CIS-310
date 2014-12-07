package Ch7Prob1;

/**
 *
 * @author kianna
 */
public class Rainfall {
    private double totalRain[];
    private double year = 0;
   
    public Rainfall(){
        
    }
    public void setData(double[] m){
        totalRain = m;
        
        for(int i = 0; i < totalRain.length; i++){
            year += totalRain[i]; 
        }
    }
    
    public double yearTotal(){
        //return yearly total rainfall
        return year;
    }
    
    public double avgMonth(){
        //get average of monthly rain
        double mon = year/12;
        
        return mon;
    }
    
    public double mostRain(){
        //find month with most rainfall
        double most = 0;
        most = totalRain[0];
        
        for(int i = 0; i < totalRain.length; i++){
            if(totalRain[i] > most){
                most = totalRain[i];
            }
        }
        
        return most;
    }
    public double leastRain(){
        //find month with least rainfall
        double least = 0;
        least = totalRain[0];
        for(int i = 0; i < totalRain.length; i++){
            if(totalRain[i] < least){
                least = totalRain[i];
            }
        }
        
        return least;
    }            
}
