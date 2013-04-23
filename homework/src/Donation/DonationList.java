/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Donation;

import java.util.*;

/**
 * MemberList class is the class that represents all the list of the members registered in TimeBanks website, mainly:
 * The login method which throws two kinds of exceptions UserNotFoundExeption, and FailedLoginException:
 * @see UserNotFoundExeption
 * @see FailedLoginException
 * @author Idriss Said Alaoui
 * @author Mohammed Tahri Sqalli
 */
public class DonationList {


    private List<Donation> donations;
            
    /**
     *a list of donation lists that exist in Timebanks
     */
    public DonationList()
    {
        donations = new ArrayList<Donation>();
    }
    /**
     * Method adddonation gives to the user the possibility to add a donation to the list that is already existing
     * @param m 
     */
    public void addDonation (Donation m){
        donations.add(m); 
    }
    /**
     *  deleteDonation enables the user to delete a donation from the existing list of donations
     * @param m 
     */
    public void deleteDonation (Donation m){
        int index = searchDonation(m);
        donations.remove(index);
    }
    /**
     * toString method prints out all the existing donations
     * @return String
     */   
    @Override
    public String toString(){
        String str= "" ;
         Iterator <Donation> Iter = donations.iterator();
         while(Iter.hasNext()){
          Donation d = Iter.next();
          str += d.toString() + "\n";
        }
      return str;
    }
    /**
     * searchDonation searches for a specific donation between all the existing donations
     * @param member
     * @return 
     */
    public int searchDonation(Donation member)
    {
        return donations.indexOf(member);
    }
    
    /**
     * this behavior modify attributes of the corresponding donation class
     * @param olddon this is the member that we need to change his informations
     * @param mewdon this is the member that we have to replace with
     */
    public void modifyDonation(Donation olddon, Donation mewdon) {
        
        int index = searchDonation(olddon);
        
        if(index >= 0)
        {
            deleteDonation(donations.get(index));
            addDonation(mewdon);
        }
    }
    
    /**
     * Sort the donations corresponding to the specification of the user ( by name or balance)
     * @param comp comparator object
     */
    public void sortMember(Comparator comp)
    {
        Collections.sort(donations, comp);
    }
}

