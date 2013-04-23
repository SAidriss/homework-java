/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Donation;

import java.util.Comparator;

/**
 * This is the implementation of comparator to enable sorting the Donation list by name
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class DonationDateComparator implements Comparator <Donation> {

    @Override
    public int compare(Donation d1, Donation d2) {
       return d1.getDate().compareTo(d2.getDate());
    }
    
}