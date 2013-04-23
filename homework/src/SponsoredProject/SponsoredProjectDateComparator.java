/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SponsoredProject;

import java.util.Comparator;

/**
 * SponsoredProjectComparator enables the user to sort the sponsored projects based on their dates 
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class SponsoredProjectDateComparator implements Comparator<SponsoredProject>{
    
    @Override
    public int compare(SponsoredProject sp1, SponsoredProject sp2)
    {
        return sp1.getDate().toString().compareTo(sp2.getDate().toString());
    }
    
}
