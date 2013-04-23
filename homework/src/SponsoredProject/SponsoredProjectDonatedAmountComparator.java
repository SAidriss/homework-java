/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SponsoredProject;

import java.util.Comparator;

/**
 * SponsoredProjectDonatedAmountComparator enables the user to sort the sponsored projects based on their donated amount
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class SponsoredProjectDonatedAmountComparator implements Comparator<SponsoredProject>{
    
    @Override
    public int compare(SponsoredProject sp1, SponsoredProject sp2)
    {
        if(sp1.getDonated_amount() > sp2.getDonated_amount())
        {
            return 1;
        }
        else if(sp1.getDonated_amount() < sp2.getDonated_amount())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
