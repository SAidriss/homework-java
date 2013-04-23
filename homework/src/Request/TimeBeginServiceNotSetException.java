/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Request;
/**
 *
 * @author User
 */
public class TimeBeginServiceNotSetException extends Exception{
    
    TimeBeginServiceNotSetException()
    {
        super("We can not compute the service provider extra benefice without having the time when he started the service set");
    }
}
