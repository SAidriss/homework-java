/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Member;

import java.util.Comparator;

/**
 * MemberBalanceComparator enables the user to sort the members based on their timedollars that they have
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class MemberBalanceComparator implements Comparator<Member>{
    
    @Override
    public int compare(Member m1, Member m2)
    {
        if(m1.getBalance() > m2.getBalance())
        {
            return 1;
        }
        else if(m1.getBalance() < m2.getBalance())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
