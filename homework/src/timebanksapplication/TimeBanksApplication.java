/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timebanksapplication;

import Member.Member;
import Member.MemberBalanceComparator;
import Member.MemberList;
import Member.MemberUsernameComparator;
import Request.Category;
import Request.TimeBeginServiceNotSetException;
import Request.urgentRequest;

/**
 *
 * @author User
 */
public class TimeBanksApplication {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        // TODO code application logic here
        
        double benefice = 0;
        urgentRequest urgentrequest = new urgentRequest("Accident", "need someone to help me with an accident", 2, Category.other, 20);
        MemberList memberlist = new MemberList();
        
        System.out.println("This is the urgentRequest class test");
        System.out.println("Supose that the service provider comes to the requester 13 min after it was posted");
        urgentrequest.setTime_Begin_Service(13);
        
        try{
            benefice = urgentrequest.Percentage_Benefice();
        }catch(TimeBeginServiceNotSetException e){
            System.out.println(e.getMessage());
        }
        
        System.out.printf("the interest benefice that the service provider will have is: %.2f%%\n", benefice);
        System.out.println();
        
        memberlist.addMember(new Member("coco", "password", 120));
        memberlist.addMember(new Member("fifi", "secret", 70));
        memberlist.addMember(new Member("riri", "people", 0));
        memberlist.addMember(new Member("loulou", "answer", 230));
        
        System.out.println("Here is the list of the members:\n\n");
        System.out.println(memberlist);
        
        System.out.println("Here is the list after deleting the member riri:\n\n");
        memberlist.deleteMember(new Member("riri", "people", 230));
        System.out.println(memberlist);
        
        System.out.println("Searching for a member that does not exist(donald):");
        
        System.out.println("Index of the element: " + memberlist.searchMember(new Member("donald", "kolopi", 30)));
        
        
        System.out.println("modify the username of loulou\n");
        memberlist.modifyMember(new Member("loulou", "answer", 230), new Member("new loulou", "answer", 230));     
        
        System.out.println(memberlist);
        
        System.out.println("Members sorted by their username:\n\n");
        memberlist.sortMember(new MemberUsernameComparator());
        System.out.println(memberlist);
        
        System.out.println("Members sorted by their balance:\n\n");
        memberlist.sortMember(new MemberBalanceComparator());
        System.out.println(memberlist);
        
        
        
    }
}