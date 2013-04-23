/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Member;

import java.util.Comparator;

/**
 * This is the implementation of comparator to enable sorting the member list by username
 * @author MMohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class MemberUsernameComparator implements Comparator <Member> {
     public int compare(Member m1, Member m2) {
        return m1.getUsername().compareTo(m2.getUsername());
    }
}
