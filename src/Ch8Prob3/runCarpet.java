package Ch8Prob3;

import java.util.Scanner;

/**
 *
 * @author kianna
 */
public class runCarpet {
    public static void main(String[] args){
     
        double sqFtPrice;
        double roomLength;
        double roomWidth;
        RoomDimension rd = new RoomDimension();
        RoomCarpet rc =  new RoomCarpet();
        
        
        Scanner askPrice = new Scanner(System.in);
        System.out.println("What is the price of the carpet per square foot: ");
        sqFtPrice = askPrice.nextDouble();
         
        Scanner askLength = new Scanner(System.in);
        System.out.println("Enter the length of your room: ");
        roomLength = askLength.nextDouble();
        
        Scanner askWidth = new Scanner(System.in);
        System.out.println("Enter the width of your room: ");
        roomWidth = askWidth.nextDouble();
        
        rd.setRD(roomLength, roomWidth);
        rc.setRC(sqFtPrice, rd);
        
        System.out.println("Your total cost is : " + rc.getTotalCost() );
        
    }
}
