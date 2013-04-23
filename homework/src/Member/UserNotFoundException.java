
package Member;

/**
 * UserNotFoundExeption is an exception class that handles an incorrect username case
 * @see Member
 * @author Idriss Said Alaoui
 * @author Mohammed Tahri Sqalli
 */
public class UserNotFoundException extends java.lang.Exception
{
    String Username;
    
    public UserNotFoundException(String Username)
    {
        super("the username "+ Username+" is not valid!!!");
        this.Username = Username;
    }
}
