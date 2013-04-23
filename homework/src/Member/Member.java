
package Member;

import Community.Community;
import java.util.Objects;
import java.util.Scanner;

/**
 * Member class is the class that represents all the information about the member registred if the system, mainly:
 * The username of the user
 * The password of the user
 * The balance if the user
 * the community in which the user is enrolled in
 * The profile of the user
 * @see Community
 * @see Profile
 * @author Idriss Said Alaoui
 * @author Mohammed Tahri Sqalli
 */
public class Member {
    
    private String Username;
    private String Password;
    private double Balance;
    Community community;
    Profile profile;
    private String SpecialAnswer;
    
    Scanner input = new Scanner(System.in);
    /**
     * Constructor that initializes an object member with the following variables:
     * @param Username
     * @param Password
     * @param Balance
     */
    public Member(String Username, String Password, double Balance, Community community, Profile profile, String SpecialAnswer) {
        this.Username = Username;
        this.Password = Password;
        this.Balance = Balance;
        this.community = community;
        this.profile = profile;
        this.SpecialAnswer = SpecialAnswer;
    }
    
    public Member(String Username, String Password, double Balance) {
        this.Username = Username;
        this.Password = Password;
        this.Balance = Balance;
    }
  
    /**
     *  Setter that sets the username of the member
     * @param Username
     */
    public void setUsername(String Username)
    {
        this.Username = Username;
    }
    /**
     *  Setter that sets the password of the member
     * @param Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    /**
     * Getter that provides the username of the member
     * @return Username
     */
    public String getUsername() {
        return Username;
    }
    /**
     * Getter that provides the Password of the Member
     * @return Password
     */
    public String getPassword() {
        return Password;
    }
    /**
     * Overriden method toString that prints all the information about the member, mainly
     * the username, and the password
     * @return
     */
    @Override
    public String toString()
    {
        return "Username: " + Username + "\nPassword: "+ Password + "\n Balance: " + Balance;
    }

    /**
     * Overriden method that compares between two object of type member
     * @param obj
     * @return boolean
     */
    
    @Override
    public boolean equals(Object obj)
    {        
        if(obj instanceof Member)
        {
            Member memb = (Member)obj;
            
            return this.Username.equals(memb.getUsername());
        }
        return false;
    }
    
    
    /**
     * Authenticate method enables checking if the password is the same as the one that the user entred
     * @param Password
     * @return boolean
     */
    public boolean authenticate(String Password)
    {
        return this.Password.equals(Password);
    }
    /**
     * spend method enables the user to spend some timedollars
     * @param Amount
     */
    public void spend(double Amount)
    {
        this.Balance -= Amount;
    }
    /**
     * earn method enables the user to gain some Timedollars
     * @param Amount
     */
    public void earn(double Amount)
    {
        this.Balance += Amount;
    }
    /**
     * Getter that provides the Balance of the member
     * @return Balance
     */
    public double getBalance() {
        return Balance;
    }
    /**
     * Setter that sets the balance of the member
     * @param Balance
     */
    public void setBalance(double Balance) {
        this.Balance = Balance;
    }
    /**
     * Setter that sets the community of the member
     * @return com
     */
    public Community getCommunity() {
        return community;
    }
    /**
     * Getter that provides the profile of the member
     * @return profile
     */
    public Profile getProfile() {
        return profile;
    }
    /**
     * Getter that provides the community of the member
     * @param community
     */
    public void setCommunity(Community community) {
        this.community = community;
    }
    
    /**
     * getter that gets the special answer of the member
     * @return SpecialAnswer
     */
    public String getSpecialAnswer() {
        return SpecialAnswer;
    }

   /**
     * change the user password
     * @param password
     */
    public void ChangePass(String password)
    {
        setPassword(password);
    }

    
    /**
     * Setter that sets the profile of the member
     * @param profile
     */
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    /**
     * Setter that sets the special answer
     * @param SpecialAnswer
     */
    
    public void setSpecialAnswer(String SpecialAnswer) {
        this.SpecialAnswer = SpecialAnswer;
    }
    
    /**
     * asking the user for the special answer in case he forget his password
     *
     */
    public void forgotPassword()
    {
        boolean flag = true;
        System.out.println("Please answer to this question??");
        System.out.println("Where did you studied in your highschool>> ");
        
        int i = 0;
        
        while(flag)
        {
            String answer = input.nextLine();
            
            if(answer.equals(SpecialAnswer))
            {
                System.out.println("You got it Right, specify your new password>> ");
                String newPassword = input.nextLine();
                ChangePass(newPassword);
                flag = false;
            }
            
             System.out.println("try again");
             i++;
             if(i<3)
             {
                 System.out.println("Your chance of trying has expired out ");
             }
             
        }        
    } 
    
}
