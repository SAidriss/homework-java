/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SponsoredProject;

import java.util.*;

/**
 * MessageList is the list that contains all the sponsored projects
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class SponsoredProjectList {
    
    private List<SponsoredProject> sponsoredprojects;
            
    /**
     *a list of accounts existing in the database
     */
    public SponsoredProjectList()
    {
        sponsoredprojects = new LinkedList<SponsoredProject>();
    }
    /**
     * Adds a sponsoredproject to the list of all the sponsored projects
     * @param m 
     */
    public void addSponsoredProject (SponsoredProject m){
        sponsoredprojects.add(m); 
    }
    /**
     * deletes a sponsoredproject from the list of all the sponsored projects
     * @param m 
     */
    public void deleteMember (SponsoredProject m){
        int index = searchSponsoredProject(m);
        sponsoredprojects.remove(index);
    }
    /**
     * Prints all the information about sponsoredProject
     * @return String
     */   
    @Override
    public String toString(){
        String str= "" ;
         Iterator <SponsoredProject> Iter = sponsoredprojects.iterator();
         while(Iter.hasNext()){
          SponsoredProject me = Iter.next();
          str += me.toString() + "\n";
        }
      return str;
    }
    /**
     * searchSponsoredProject searches for a specific sponsored project between all the sponsored projects that are in the sponsored project list
     * @param member
     * @return the index of the place where the message was stored 
     */
    public int searchSponsoredProject(SponsoredProject member)
    {
        return sponsoredprojects.indexOf(member);
    }
    
    /**
     * this behavior modify attributes of the corresponding class
     * @param oldspon this is the member that we need to change his informations
     * @param newspon this is the member that we have to replace with
     */
    public void modifySponsoredProject(SponsoredProject oldspon, SponsoredProject newspon) {
        
        int index = searchSponsoredProject(oldspon);
        
        if(index >= 0)
        {
            deleteMember(sponsoredprojects.get(index));
            addSponsoredProject(newspon);
        }
    }
    
    /**
     * Sort the members corresponding to the specification of the user ( by name or balance)
     * @param comp comparator object
     */
    public void sortSponsoredProject(Comparator comp)
    {
        Collections.sort(sponsoredprojects, comp);
    }
}

