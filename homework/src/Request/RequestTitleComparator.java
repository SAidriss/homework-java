/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Request;

import java.util.Comparator;

/**
 * RequestTitleComparator enables the user to sort the requests based on their titles 
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class RequestTitleComparator implements Comparator <Request> {
    public int compare(Request m1, Request m2) {
        return m1.getTitle().compareTo(m2.getTitle());
    }
}
