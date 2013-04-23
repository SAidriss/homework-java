
package Community;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

/**
 * Community list is the class where there is the list of all communities under timebanks website
 * @see Communnity
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class CommunityList {
    
     private ArrayList <Community> communities = null ;
     /**
      * Constructor of CommunityList with no arguments
      */
      public CommunityList() {
       communities = new ArrayList <Community> ();
    }
      /**
       * Method add community gives to the user the possibility to add a community to the list that is already existing
       * @param c this param is the community to be added to the list
       */
      public void addCommunity (Community c){
        communities.add(c); 
    }
      /**
       * deleteCommunity enables the user to delete a community from the existing list of communities
       * @param c is the community to be deleted
       * @return the index of the community that was deleted
       */
     public Community deleteCommunity (Community c){
        int index = searchCommunity(c);
        return communities.remove(index);
    } 
     /**
      * searchCommunity searches for a specific commmunity between all the existing communities
      * @param c
      * @return 
      */
      public int searchCommunity (Community c){
        return communities.indexOf(c);
    }
      /**
       * sortCommunity enables the user to sort the communities based on a specific criteria using a comparator
       * @param cmp 
       */
     public void sortCommunity (Comparator cmp){
      Collections.sort(communities, cmp);
     }
     /**
      * toString method prints out all the existing communities
      * @return String
      */
    @Override
    public String toString(){
        String str= "" ;
         ListIterator <Community> Iter = communities.listIterator();
         while(Iter.hasNext()){
          Community co = Iter.next();
          str += co.toString() + "\n";
        }
      return str;
    }  
    
    /**
     * 
     * this behavior modifies a community
     * @param oldCom this is the member that we need to change his informations
     * @param mewCom this is the member that we have to replace with
     */
    public void modifyCommunity(Community oldMemb, Community mewMemb) {
        
        int index = searchCommunity(oldMemb);
        
        if(index >= 0)
        {
            deleteCommunity(communities.get(index));
            addCommunity(mewMemb);
        }
    }
}
