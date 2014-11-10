/*
 * Run personal information.
 */
package Chapter6Problem3;

/**
 *
 * @author kianna
 */
public class RunPersonal {
    public static void main(String[] args){
        //Create Kianna
        Personal kianna = new Personal();
        makePer(kianna, "Kianna Reed", 34,"10 Queensbrook Pl", "314-398-7569");
    
    //Create Carl
        Personal carl = new Personal();
        makePer(carl, "Carl Reed", 34,"10 Queensbrook Pl", "314-920-7492");
    
//Create Grandma
        Personal myra = new Personal();
        makePer(myra, "Myra McAllister", 77,"2110 Greensbrook Pl", 
                "867-398-4463");
    }
    
    
    
   private static void makePer(Personal per, String name, int age, 
            String address, String phone)
    {
        per.setName(name);
        per.setAge(age);
        per.setAddress(address);
        per.setPhone(phone);
        
        System.out.println(per.getName() + " " + per.getAge() + " " 
                + per.getAddress() + " " + per.getPhone());
    }
    
}
