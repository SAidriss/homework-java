
package Donation;

import SponsoredProject.SponsoredProject;
import Member.Member;
import java.util.Date;
import java.util.Objects;
/**
 * Donation class is the class that represents all the information about the donation, mainly:
 * The date of the donation
 * The amount donated
 * The sponsored project
 * @author Idriss Said Alaoui
 * @author Mohammed Tahri Sqalli
 */

public class Donation {
    Date d = new Date();
    private String date = d.toString();
    private double Amount_donated;
    SponsoredProject sponsored_project = new SponsoredProject();
    Member donor;
    /**
     * Constructor that initializes an object with the following variables
     * @param Amount_donated
     */
    public Donation(double Amount_donnated, Member donor) {
        this.Amount_donated = Amount_donated;
        this.donor = donor;
    }
    /**
     * Constructor with no arguments and no returns
     */
    public Donation() {
    }
    /**
     * Getter that provides the date of the donation
     * @return date
     */
    public String getDate() {
        return date;
    }
    /**
     * Getter that provides the amount donated
     * @return Amount_donated
     */
    public double getAmount_donnated() {
        return Amount_donated;
    }
    /**
     * Getter that provides the sponsored project of the donation
     * @return sponsored_project
     */
    public SponsoredProject getSponsored_project() {
        return sponsored_project;
    }
    /**
     * Setter that sets the date of the donation
     * @param Date
     */
    public void setDate(Date Date) {
        this.date = d.toString();
    }
    /**
     * Setter that sets the amount donated of the donation
     * @param Amount_donated
     */
    public void setAmount_donnated(double Amount_donated) {
        this.Amount_donated = Amount_donated;
    }
    /**
     * Setter that sets the sponsored project of the donation
     * @param sponsored_project
     */
    public void setSponsored_project(SponsoredProject sponsored_project) {
        this.sponsored_project = sponsored_project;
    }
    /**
     * Overriden version of the method toString that prints all the information about the donation
     * @return String
     */
    @Override
    public String toString()
    {
        return "Amount Donated: " + Amount_donated + "\nDate: " + date + "\n Sponsored Project: "+ sponsored_project;
    }

    /**
     * Getter that provides the amount donated
     * @return Amount_donated
     */
    public double getAmount_donated() {
        return Amount_donated;
    }
    /**
     * Getter that provides the donor
     * @return donor
     */
    public Member getDonor() {
        return donor;
    }
    /**
     * Setter that sets the amount donated of the donation
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * Setter that sets the amount donated of the donation
     * @param Amount_donated
     */
    public void setAmount_donated(double Amount_donated) {
        this.Amount_donated = Amount_donated;
    }
    /**
     * Setter that sets the amount donated of the donation
     * @param donor
     */
    public void setDonor(Member donor) {
        this.donor = donor;
    }

     /**
     *  Overriden version of the method equals that checks if two donation are the same
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
        final Donation other = (Donation) obj;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (Double.doubleToLongBits(this.Amount_donated) != Double.doubleToLongBits(other.Amount_donated)) {
            return false;
        }
        if (!Objects.equals(this.sponsored_project, other.sponsored_project)) {
            return false;
        }
        if (!Objects.equals(this.donor, other.donor)) {
            return false;
        }
        return true;
    }
    
    
}
