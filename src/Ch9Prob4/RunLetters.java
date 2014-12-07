package Ch9Prob4;
import java.util.Scanner;
/**
 *
 * @author kianna
 */
public class RunLetters {
    public static void main(String[] args){
        VowelsAndConsanants vc = new VowelsAndConsanants();
        String text;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string and choose an option 1 - 5: ");
        text = input.nextLine();
        vc.parseInput(text);
        
        Scanner in = new Scanner ( System.in );
        System.out.println("1-Count the number of vowels in a string: ");
        System.out.println("2-Count the number of vowels in a string: ");
        System.out.println("3-Count the number of vowels and consanants "
                + "in a string: ");
        System.out.println("4-Enter another string: ");
        System.out.println("5-Exit the program ");
        //int num = Integer.valueOf(text);
        switch (in.nextInt()){
        case 1:
            System.out.println("There are  " + vc.getVowel() + " vowels.");
        break;
        case 2:
            System.out.println("There are " + vc.getCons() + " consonants");
        break;
        case 3:
            System.out.println("The amount of vowels are: " + vc.getVowel() 
                    +  " The amount of consonants are: " + vc.getCons());
        break;
        case 4:
            Scanner vcInput = new Scanner(System.in);
            System.out.println("Enter another String: ");
            String input1 = vcInput.nextLine();
            text = input1;
            vc.parseInput(text);
        break;
        case 5:
            System.exit(0);
        break;
        default:
            System.err.println("Unrecognized option");
        break;
    }
  }
   
        
    
}
