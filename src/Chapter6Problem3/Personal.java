/*
 * Create class to store personal information.
 */
package Chapter6Problem3;

/**
 *
 * @author kianna
 */
public class Personal {
    private String name;
    private int age;
    private String address;
    private String phone;
    
    public Personal ()
    {
        name = "";
        age = 0;
        address = "";
        phone = "";
    }
    //Create setters
    public void setName(String perName){
        name = perName;
    }
    public void setAge(int perAge){
        age = perAge;
    }
    public void setAddress(String homeAdd){
        address = homeAdd;
    }
    public void setPhone(String number){
        phone = number;
    }
  //Create getters  
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
}
