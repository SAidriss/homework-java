/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Request;

/**
 * Class urgentRequest is an extension of class Request
 * this class is used when the request owner want his request to be done quickly
 * If someone begin the request before a certain time specified by the request owner, he can win an extra plus to his time dollars
 * @see Request
 * @author Said Alaoui Idriss
 */
public class urgentRequest extends Request{
    
    /**
     *  The request owner specify the time he wants his work to be done in Time_Urgency
     *  Then, he notes the time when the service has began in Time_Begin_Service
     */
    private int Time_Urgency;
    private int Time_Begin_Service = -1;
    
    /**
     * this constructor initialize urgentRequest and Request class
     * @param Title
     * @param Description
     * @param time_required
     * @param category
     * @param Time_Urgency 
     * @see Request
     * 
     */
    public urgentRequest(String Title, String Description, int time_required, Category category, int Time_Urgency)
    {
        super(Title, Description, time_required, category);
        this.Time_Urgency = Time_Urgency;
    }
    
    /**
     * give Time_Urgency value
     * @return Time_Urgency
     */
    
    public int getTime_Urgency() {
        return Time_Urgency;
    }

    /**
     * give Time_Begin_Service value
     * @return Time_Begin_Service
     */
    
    public int getTime_Begin_Service() {
        return Time_Begin_Service;
    }

    /**
     * set Time_Urgency value
     * @param Time_Urgency 
     */
    public void setTime_Urgency(int Time_Urgency) {
        this.Time_Urgency = Time_Urgency;
    }

    /**
     * set Time_Begin_Service value
     * @param Time_Begin_Service 
     */
    
    public void setTime_Begin_Service(int Time_Begin_Service) {
        this.Time_Begin_Service = Time_Begin_Service;
    }
    
    /**
     * the percentage of benefice is the percentage difference between the time where the service provider starts working and the urgency time set by the request owner
     * @return the percentage of benefice
     * @throws TimeBeginServiceNotSetException
     */
    public double Percentage_Benefice() throws TimeBeginServiceNotSetException
    {
        if(Time_Urgency > Time_Begin_Service)
        {
            if(!(Time_Begin_Service == -1))
            {
                return (1 - (double)Time_Begin_Service/Time_Urgency)*100;
                        
            }else{
                throw new TimeBeginServiceNotSetException();
            }
        }
        else
        {
            return 0;
        }
    }

    /**
     * change the attributes of the object into a string
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "\nTime_Urgency: " + Time_Urgency + "\nTime_Begin_Service: " + Time_Begin_Service+"\n";
    }
    
    
}
