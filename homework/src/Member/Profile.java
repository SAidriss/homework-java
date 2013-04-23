
package Member;

import java.util.Objects;

/**
 * Profile class is the class that represents all the information about a profile of a member registered in TimeBanks website, mainly:
 * First name
 * Last name
 * Email
 * Phone
 * Adress
 * Interests
 *
 * @author Idriss Said Alaoui
 * @author Mohammed Tahri Sqalli
 */
public class Profile {
    
    private String First_name;
    private String Last_name;
    private String Email;
    private String Phone;
    private String Address;
    private String Interests;
    /**
     *  Constructor with no arguments and no returns
     */
    public Profile()
    {
        
    }
    /**
     * Constructor that initializes an object member with the following variables:
     * @param First_name
     * @param Last_name
     * @param Email
     * @param Phone
     * @param Address
     * @param Interests
     */
    public Profile(String First_name, String Last_name, String Email, String Phone, String Address, String Interests) {
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.Email = Email;
        this.Phone = Phone;
        this.Address = Address;
        this.Interests = Interests;
    }
    /**
     *   Getter that provides the First Name of the profile
     * @return First_name
     */
    public String getFirst_name() {
        return First_name;
    }
    /**
     *  Getter that provides the Last Name of the profile
     * @return Last_name
     */
    public String getLast_name() {
        return Last_name;
    }
    /**
     *  Getter that provides the email of the profile
     * @return Email
     */
    public String getEmail() {
        return Email;
    }
    /**
     *  Getter that provides the phone Number of the profile
     * @return Phone
     */
    public String getPhone() {
        return Phone;
    }
    /**
     *  Getter that provides the address Name of the profile
     * @return Address
     */
    public String getAddress() {
        return Address;
    }
    /**
     *  Getter that provides the Interests of the profile
     * @return Interests
     */
    public String getInterests() {
        return Interests;
    }
    /**
     * Setter that sets the First Name of the profile
     * @param First_name
     */
    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }
    /**
     * Setter that sets the Last Name of the profile
     * @param Last_name
     */
    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }
    /**
     * Setter that sets the Email of the profile
     * @param Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
    /**
     * Setter that sets the phone Number of the profile
     * @param Phone
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    /**
     * Setter that sets the Address of the profile
     * @param Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }
    /**
     * Setter that sets the FInterests of the profile
     * @param Interests
     */
    public void setInterests(String Interests) {
        this.Interests = Interests;
    }
    /**
     *  Overriden version of the method toString that prints all the information about the profile
     * @return String
     */
    @Override
    public String toString()
    {
        return "First Name: "+ First_name +"\nLast Name"+ Last_name +"\nInterests: "+Interests+"\nPhone:" + Phone +"\nEmail: "+Email+"\nAdress" + Address;
    }

    /**
     * compare two profile objects
     * @return boolean
     * @param obj
     */
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profile other = (Profile) obj;
        if (!Objects.equals(this.First_name, other.First_name)) {
            return false;
        }
        if (!Objects.equals(this.Last_name, other.Last_name)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        if (!Objects.equals(this.Phone, other.Phone)) {
            return false;
        }
        if (!Objects.equals(this.Address, other.Address)) {
            return false;
        }
        if (!Objects.equals(this.Interests, other.Interests)) {
            return false;
        }
        return true;
    }
    
    
    
}
