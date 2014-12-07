/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch8Prob1;
import java.util.*;

/**
 *
 * @author carl
 */
public class RunArea {
        
    public static void main(String[] args){
        String userShape;
        int rectLength;
        int rectWidth;
        double circRad;
        int rectArea;
        double circArea;
        double cylHeight;
        double cylRadius;
        double cylArea;
    
        //get the area of the cylider
        Scanner shapeScan = new Scanner(System.in);
        do{
            System.out.println("Please chooce a shape: Cylinder, Circle, "
                + "or Rectangle.");
            userShape = shapeScan.next();
        }while(userShape.toLowerCase().equals("circle") 
                && userShape.toLowerCase().equals("cylinder")
                && userShape.toLowerCase().equals( "rectangle"));

        switch(userShape.toLowerCase()){
            case "circle":
                Scanner radScan = new Scanner(System.in);
                do{
                    System.out.println("What is the circle's radius?");
                    circRad = radScan.nextDouble();
                }while(circRad < 0);
                circArea = Area.getArea(circRad);
                System.out.println(circArea);
                break;
            case "rectangle":
                Scanner widthScan = new Scanner(System.in);
                do{
                    System.out.println("What is the rectangles's length?");
                    rectLength = widthScan.nextInt();
                }while(rectLength < 0);
                
                Scanner heightScan = new Scanner(System.in);
                do{
                    System.out.println("What is the rectangles's width?");
                    rectWidth = heightScan.nextInt();
                }while(rectWidth < 0);
                rectArea = Area.getArea(rectLength, rectWidth);
                System.out.println(rectArea);
                break;
            case "cylinder":
                Scanner cylRadScan = new Scanner(System.in);
                do{
                    System.out.println("What is the cylinder's radius?");
                    cylRadius = cylRadScan.nextInt();
                }while(cylRadius < 0);
                
                Scanner cylHeightScan = new Scanner(System.in);
                do{
                    System.out.println("What is the cylinder's height?");
                    cylHeight = cylHeightScan.nextInt();
                }while(cylHeight < 0);
                cylArea = Area.getArea(cylRadius, cylHeight);
                System.out.println(cylArea);
                break;
        }
    }
    
    
                    
}
