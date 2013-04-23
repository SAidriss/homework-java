package Request;
import Member.Member;
import java.util.Date;
/**
 * Request class is the class that represents all the information about a request of a member registered in TimeBanks website, mainly:
 * The title of the request
 * The description of the request
 * the date of the request
 * the time of the request
 * the time required in order for the request to be accomplished
 * the category of the request
 * the service of the request
 * the status of the request
 * @see Service
 * @see Status
 * @see Category
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class Request {
    Date d = new Date();
    private String Title;
    private String Description;
    private String Date = d.toString();
    private int time_required;
    Category category;
    Service service = new Service();
    Status statut = Status.pending;
    Member request_owner;
    /**
     * Constructor that initializes an object member with the following variables:
     * @param Title
     * @param Description
     * @param time
     * @param time_required
     * @param category
     */
    public Request(String Title, String Description, int time_required, Category category) {
        this.Title = Title;
        this.Description = Description;
        this.time_required = time_required;
        this.category = category;
    }
    /**
     *  Constructor with no arguments and no returns
     */
    public Request() {
    }
    /**
     * Getter that provides the status of the request
     * @return st
     */
    public Status getStatut() {
        return statut;
    }

    /**
     *  Setter that sets the title of the request
     * @param Date
     */
    
    public void setDate(String Date) {
        this.Date = Date;
    }
    /**
     *  Setter that sets the title of the request
     * @param request_owner
     */
    public void setRequest_owner(Member request_owner) {
        this.request_owner = request_owner;
    }
    
    /**
     * Getter that provides the title of the request
     * @return Title
     */
    public String getTitle() {
        return Title;
    }
    /**
     * Getter that provides the description of the request
     * @return Description
     */
    public String getDescription() {
        return Description;
    }
    /**
     * Getter that provides the date of the request
     * @return Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * Getter that provides the time for the request to be accomplished
     * @return time_required
     */
    public int getTime_required() {
        return time_required;
    }
    /**
     * Getter that provides Category of the request
     * @return
     */
    
    
    public Category getCategory() {
        return category;
    }
    /**
     * Getter that provides the service of the request
     * @return service;
     */
    public Service getService() {
        return service;
    }
    /**
     *  Setter that sets the title of the request
     * @param Title
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }
    /**
     * Setter that sets the description of the request
     * @param Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }
    /**
     * Setter that sets the date of the request
     */
    public void setDate() {
        this.Date = d.toString();;
    }

    /**
     * Setter that sets the time for the request to be accomplished
     * @param time_required
     */
    public void setTime_required(int time_required) {
        this.time_required = time_required;
    }
    /**
     * Setter that sets the category of the request
     * @param category
     */
    public void setCategory(Category category) {
        this.category = category;
    }
    /**
     * Setter that sets the service of the request
     * @param service
     */
    public void setService(Service service) {
        this.service = service;
    }
    /**
     * Setter that sets the status of the request
     * @param statut
     */
    public void setStatut(Status statut) {
        this.statut = statut;
    }
    /**
     * Overriden version of the method toString that prints all the information about the Request
     * @return String
     */
    @Override
    public String toString()
    {
        return "Date: " + Date + "\nDescription: " + Description + "\nTitle: "+ Title + "\nCategory: "+ category+ "\nservice: "+service+"\nstatus: "+statut+"\nTime Required: "+time_required+"\n request owner"+request_owner;
    }
}
