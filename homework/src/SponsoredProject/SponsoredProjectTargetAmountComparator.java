/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SponsoredProject;

import java.util.Comparator;

/**
 * SponsoredProjectTargetAmountComparator enables the user to sort the requests based on their sponsored project amount
 * @author Mohammed Tahri Sqalii
 * @author Idriss Said Alaoui
 */
public class SponsoredProjectTargetAmountComparator implements Comparator<SponsoredProject>{
    
    @Override
    public int compare(SponsoredProject sp1, SponsoredProject sp2)
    {
        if(sp1.getTarget_amount() > sp2.getTarget_amount())
        {
            return 1;
        }
        else if(sp1.getTarget_amount() < sp2.getTarget_amount())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
