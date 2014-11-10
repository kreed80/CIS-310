/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6Problem2;

/**
 *
 * @author kianna
 */
public class RunCar {
    public static void main(String[] args){
        Car toyota= new Car(1987, "Toyota");
        
        for(int i=0; i < 5; i++){
            toyota.accelerate();
            System.out.println(toyota.getSpeed());
        }
        for(int i=0; i < 5; i++){
            toyota.brake();
            System.out.println(toyota.getSpeed());
        }
    }
}
