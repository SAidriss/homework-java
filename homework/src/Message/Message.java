
package Message;

/**
 * Message class is the class that represents all the information about a message of a member registered in TimeBanks website, mainly:
 * Availability time
 * Time message received
 * Time Message sent
 * The reply to the message
 * @see Reply
 * @author Idriss Said Alaoui
 * @author Mohammed Tahri Sqalli
 */
public class Message {
    private int Availability_time;
    private int Time_received;
    private int Time_sent;
    Reply rep;
    /**
     *  Constructor with no arguments and no returns
     */
    public Message() {
    }
    /**
     * Constructor that initializes an object member with the following variables:
     * @param Availability_time
     * @param Time_received
     * @param Time_sent
     */
    public Message(int Availability_time, int Time_received, int Time_sent) {
        this.Availability_time = Availability_time;
        this.Time_received = Time_received;
        this.Time_sent = Time_sent;
    }
    /**
     * Getter that provides the reply to the message
     * @return rep
     */
    public Reply getRep() {
        return rep;
    }
    /**
     * Getter that provides the reply to the message
     * @return Availability_time;
     */
    public int getAvailability_time() {
        return Availability_time;
    }
    /**
     * Getter that provides the time when the message was received
     * @return Time_received
     */
    public int getTime_received() {
        return Time_received;
    }
    /**
     * Getter that provides the time when the message was sent
     * @return Time_sent
     */
    public int getTime_sent() {
        return Time_sent;
    }
    /**
     * Setter that sets Availability time of the member
     * @param Availability_time
     */
    public void setAvailability_time(int Availability_time) {
        this.Availability_time = Availability_time;
    }
    /**
     * Setter that sets the time when the message was received
     * @param Time_received
     */
    public void setTime_received(int Time_received) {
        this.Time_received = Time_received;
    }
    /**
     * Setter that sets the time when the message was sent
     * @param Time_sent
     */
    public void setTime_sent(int Time_sent) {
        this.Time_sent = Time_sent;
    }
    /**
     * Setter that sets the reply of the reply
     * @param rep
     */
    public void setRep(Reply rep) {
        this.rep = rep;
    }
    /**
     * Overriden version of the method toString that prints all the information about the Message
     * @return String
     */
    @Override
    public String toString() {
        return "Availability Time:" + Availability_time + "\nTime Received: " + Time_received + "\nTime Sent: " + Time_sent + "\nreply: " + rep;
    }
    
    
}
