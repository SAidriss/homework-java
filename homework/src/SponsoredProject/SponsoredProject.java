
package SponsoredProject;

import java.util.Date;
import java.util.Objects;

/**
 * SponsoredProject class is the class that represents all the information about the sponsored Project, mainly:
 * The date of the sponsored project
 * The description of the sponsored project
 * The target amount of the sponsored project
 * The donated amount of the sponsored project
 *
 * @author Idriss Said Alaoui
 * @author Mohammed Tahri Sqalli
 */
public class SponsoredProject {
   
    Date d = new Date();
    
    private String Description;
    private double Target_amount;
    private double Donated_amount;
    private String date = d.toString();
    /**
     *  Constructor with no arguments and no returns
     */
    public SponsoredProject() {
    }
    /**
     * Constructor that initializes an object with the following variables:
     * @param Description
     * @param Target_amount
     * @param Donated_amount
     */
    public SponsoredProject(String Description, double Target_amount, double Donated_amount) {
        this.Description = Description;
        this.Target_amount = Target_amount;
        this.Donated_amount = Donated_amount;
    }
    /**
     * Getter that provides the description of the sponsored Project
     * @return Description
     */
    public String getDescription() {
        return Description;
    }
    /**
     * Getter that provides the Target Amount of the sponsored project
     * @return Target_amount
     */
    public double getTarget_amount() {
        return Target_amount;
    }
    /**
     * Getter that provides the donated Amount of the sponsored project
     * @return Donated_amount
     */
    public double getDonated_amount() {
        return Donated_amount;
    }
    /**
     * Getter that provides the date of the sponsored project
     * @return date
     */
    public String getDate() {
        return date;
    }
    /**
     * Setter that sets the description of the sponsored project
     * @param Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }
    /**
     * Setter that sets the target amount of the sponsored project
     * @param Target_amount
     */
    public void setTarget_amount(double Target_amount) {
        this.Target_amount = Target_amount;
    }
    /**
     * Setter that sets the donated amount of the sponsored project
     * @param Donated_amount
     */
    public void setDonated_amount(double Donated_amount) {
        this.Donated_amount = Donated_amount;
    }
    /**
     * Setter that sets the date of the the sponsored project
     * @param date
     */
    public void setDate() {
        this.date = d.toString();
    }
    /**
     * Overriden version of the method toString that prints all the information about the  sponsored donation
     * @return String
     */
    @Override
    public String toString()
    {
        return "Description: " + Description + "\nDonated Amount: " + Donated_amount + "\nTarget Amount: "+ Target_amount + "\nDate: "+ date;
    }

     /**
     *  Overriden version of the method equals that checks if two sponsored project are the same
     * @param obj
     * @return boolean
     */
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SponsoredProject other = (SponsoredProject) obj;
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.Target_amount) != Double.doubleToLongBits(other.Target_amount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.Donated_amount) != Double.doubleToLongBits(other.Donated_amount)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    /**
     *  an amount is added to previous donated amount
     * @param amount
     */
    
    public void Donate(double amount)
    {
        Donated_amount += amount;
    }
    
    
}
