
package Community;

import java.util.Comparator;

/**
 * This is the implementation of comparator to enable sorting the Community list by name
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class CommunityNameComparator implements Comparator <Community> {
   public int compare(Community c1, Community c2) {
        return c1.getName().compareTo(c2.getName());
    }
   
   
}
