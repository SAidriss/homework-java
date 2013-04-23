
package Member;

/**
 * FailedLoginException is an exception class that handles an incorrect password case
 * @see Member
 * @author Idriss Said Alaoui
 * @author Mohammed Tahri Sqalli
 */
public class FailedLoginException extends java.lang.Exception{
    String Password;
    
    public FailedLoginException(String Password)
    {
        super("Incorrect Password");
        this.Password = Password;
    }
}
