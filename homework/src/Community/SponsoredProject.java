
package Community;

import java.util.*;

/**
 *Class soonsoredProject contains all the details about sponsored project mainly
 * the desctiption
 * the targeted amount
 * the donated amount
 * the date of the donation
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class SponsoredProject {
    
    String Description;
    double target_amount;
    double donated_amount;
    Date date;
    /**
     * Constructor that initializes an object with the following variables
     * @param Description
     * @param target_amount
     * @param donated_amounted 
     */
    public SponsoredProject(String Description, double target_amount, double donated_amounted) {
        this.Description = Description;
        this.target_amount = target_amount;
        this.donated_amount = donated_amounted;
    }
    /**
     * Getter for the description
     * @return Description
     */
    public String getDescription() {
        return Description;
    }
    /**
     * Getter for the target amount
     * @return target_amount
     */
    public double getTarget_amount() {
        return target_amount;
    }
    /**
     * Getter for the donated amount
     * @return donated_amount
     */
    public double getDonated_amounted() {
        return donated_amount;
    }
    /**
     * Getter for the date
     * @return date
     */
    public Date getDate() {
        return date;
    }
    /**
     * Setter for the description
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }
    /**
     * Setter for the target amount
     * @param target_amount 
     */
    public void setTarget_amount(double target_amount) {
        this.target_amount = target_amount;
    }
    /**
     * Setter for the donated amount
     * @param donated_amount 
     */
    public void setDonated_amounted(double donated_amount) {
        this.donated_amount = donated_amount;
    }
    /**
     * Setter for the date
     * @param date 
     */
    public void setDate(Date date) {
        this.date = date;
    }
    /**
     * toString method that prints all the info about the sponsored project
     * @return 
     */
    @Override
    public String toString() {
        return "SponsoredProject{" + "Description=" + Description + ", target_amount=" + target_amount + ", donated_amounted=" + donated_amount + ", date=" + date + '}';
    }
    /**
     * Equals compares two objects of type sponsoredproject 
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
        if (Double.doubleToLongBits(this.target_amount) != Double.doubleToLongBits(other.target_amount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.donated_amount) != Double.doubleToLongBits(other.donated_amount)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    
}
 