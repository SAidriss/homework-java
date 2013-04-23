
package Member;
import Community.Community;
import java.util.*;

/**
 * MemberList class is the class that represents the list of all the members registered in TimeBanks website, mainly:
 * The login method which throws two kinds of exceptions UserNotFoundExeption, and FailedLoginException:
 * @see UserNotFoundExeption
 * @see FailedLoginException
 * @author Idriss Said Alaoui
 * @author Mohammed Tahri Sqalli
 */
public class MemberList {


    private List<Member> members;
            
    /**
     *a list of accounts existing in timebanks website
     */
    public MemberList()
    {
        members = new LinkedList<Member>();
    }
    /**
     * Method addmember gives to the user the possibility to add a donation to the list that is already existing
     * @param m 
     */
    public void addMember (Member m){
        members.add(m); 
    }
    /**
     * deleteDonation enables the user to delete a donation from the existing list of donations
     * @param m 
     */
    public void deleteMember (Member m){
        int index = searchMember(m);
        members.remove(index);
    }
     /**
      * toString method prints out all the existing members
      * @return String
      */  
    @Override
    public String toString(){
        String str= "" ;
         Iterator <Member> Iter = members.iterator();
         while(Iter.hasNext()){
          Member me = Iter.next();
          str += me.toString() + "\n";
        }
      return str;
    }
    /**
     * searchMember searches for a specific member between all the existing members
     * @param member
     * @return 
     */
    public int searchMember(Member member)
    {
        return members.indexOf(member);
    }
    
    /**
     * The login method enables checking whether the login was made successfully or not. if not, it can throw two
     * exceptions to handle the errors
     * @param member
     * @return
     * @throws UserNotFoundExeption
     * @throws FailedLoginException
     */
    public boolean  login (Member member)
            throws UserNotFoundException,FailedLoginException {
        
            int index = searchMember(member);       

            if (index >= 0){

                if (!members.get(index).authenticate(member.getPassword()))
                {
                    FailedLoginException ex2 = new FailedLoginException (member.getPassword());
                    throw ex2;
                }
                 else
                 {
                    return true;
                 }
            }
            UserNotFoundException ex = new UserNotFoundException(member.getUsername());
            throw ex;

        //end for

        
    }


    /**
     * this behavior modify attributes of the corresponding member class
     * @param oldMemb this is the member that we need to change his informations
     * @param mewMemb this is the member that we have to replace with
     */
    public void modifyMember(Member oldMemb, Member mewMemb) {
        
        int index = searchMember(oldMemb);
        
        if(index >= 0)
        {
            deleteMember(members.get(index));
            addMember(mewMemb);
        }
    }
    
    /**
     * Sort the members corresponding to the specification of the user 
     * @param comp comparator object
     */
    public void sortMember(Comparator comp)
    {
        Collections.sort(members, comp);
    }
}

