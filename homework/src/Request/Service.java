
package Request;

import java.util.Date;

/**
 * Service class is the class that represents all the information about a service of a member registered in TimeBanks website, mainly:
 * The date of the service
 * the time dollars of the service
 * the date of the service
 *
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class Service {
    Date d = new Date();
    private double time_dollars;
    String date = d.toString();
    
    /**
     * Constructor that initializes an object member with the following variables:
     * @param time_dollar
     */
    public Service(double time_dollar)
    {
        this.time_dollars = time_dollar;
    }
    /**
     * Constructor with no arguments and no returns
     */
    public Service()
    {
        
    }
    /**
     * Getter that provides the time dollars of the service
     * @return time_dollars
     */
    public double getTime_dollars() {
        return time_dollars;
    }
    /**
     * Getter that provides the date of the service
     * @return date
     */
    public String getDate() {
        return date;
    }
    /**
     * Setter that sets the time dollars of the service
     * @param time_dollars
     */
    public void setTime_dollars(double time_dollars) {
        this.time_dollars = time_dollars;
    }
    /**
     *Setter that sets the date of the service
     */
    public void setDate() {
        this.date = d.toString();
    }
    /**
     *  Overriden version of the method toString that prints all the information about the Service
     * @return String
     */
    @Override
    public String toString()
    {
        return "Date: "+date+"\nTime Dollars: "+time_dollars;
    }
}
