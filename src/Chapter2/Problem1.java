/*Write a program that stores certain variables and display them on screen.
 */
package Chapter2;

/**
 *
 * @author kianna
 */
public class Problem1 
{
   public static void main(String[] args)
   {
      String name;
      int age;
      double annualPay;
      
      name = "Kianna Reed";
      age = 34;
      annualPay = 100000.00;
      
      System.out.print("My name is " + name +", ");
      System.out.println("my age is " + age + " and ");
      System.out.println("I hope to earn $" + annualPay + " per year.");
   }
}
