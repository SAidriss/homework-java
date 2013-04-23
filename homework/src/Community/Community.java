
package Community;

import Member.Member;
import java.util.Objects;
/**
 * Community class is the class that represents all the information about a community, mainly:
 * The name of the community
 * The mission of the community
 * The focus of the community
 * the neighborhood of the community
 * the coordinator of the community
 * @see Member
 * @author Idriss Said Alaoui
 * @author Mohammed Tahri Sqalli
 */
public class Community {  

    private String name;
    private String mission;
    private String focus;
    Community neighborhood;
    Member coordinator;
    
    public Community()
    {
        
    }
    /**
     * This Constructor initializes  an object with the following variables:
     * @param name
     * @param mission
     * @param focus
     * @param neighborhood
     */
    public Community(String name, String mission, String focus, Community neighborhood, Member coordinator)
    {
        this.name = name;
        this.mission = mission;
        this.focus = focus;
        this.neighborhood = neighborhood;
        this.coordinator = coordinator; 
    }

    /**
     *
     * @param coordinator
     */
    public void setCoordinator(Member coordinator) {
        this.coordinator = coordinator;
    }

    /**
     *
     * @return
     */
    public Member getCoordinator() {
        return coordinator;
    }
    /**
     * Setter that sets the name of the object community
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * Setter that sets the focus of the object community
     * @param focus
     */
    public void setFocus(String focus)
    {
        this.focus = focus;
    }
    /**
     * Setter that sets the mission of the object community
     * @param mission
     */
    public void setMission(String mission) {
        this.mission = mission;
    }
    /**
     * Setter that sets the neighborhood of the object community
     * @param neighborhood
     */
    public void setNeighborhood(Community neighborhood) {
        this.neighborhood = neighborhood;
    }
    /**
     *  Getter that provides the name of the object community
     * @return name
     */
    public String getName()
    {
        return name;
    }
    /**
     * Getter that provides the mission of the object community
     * @return mission
     */
    public String getMission() {
        return mission;
    }
    /**
     * Getter that provides the focus of the community
     * @return focus
     */
    public String getFocus() {
        return focus;
    }
    /**
     * Getter that provides the focus of the object community
     * @return neighborhood
     */
    public Community getNeighborhood() {
        return neighborhood;
    }
    /**
     *  Overriden version of the method toString that prints all the information about the community
     * @return String
     */
    @Override
    public String toString() {
        
        if(neighborhood != null && coordinator != null) 
        {
          return "Community name: "+ name +"\n mission: "+ mission+"\nfocus: "+focus+"\nneighborhood: \n"+neighborhood.toString()+"\ncoordinator: \n"+ coordinator.toString()+"\n\n";  
        }
        else if(neighborhood == null && coordinator != null)
        {
            return "Community name: "+ name +"\n mission: "+ mission+"\nfocus: "+focus+"\n no neighborhood\n coordinator:\n "+ coordinator.toString()+"\n\n";  
        }
        else if(neighborhood != null && coordinator == null)
        {
            return "Community name: "+ name +"\n mission: "+ mission+"\nfocus: "+focus+"\n neighborhood: \n"+ neighborhood +"\n no coordinator\n\n";  
        }
        else
        {
            return "Community name: "+ name +"\n mission: "+ mission+"\nfocus: "+focus+"\n no neighborhood, no coordinator\n\n";  
        }
    } 
    
    /**
     *  Overriden version of the method equals that checks if two community are the same
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Community other = (Community) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.mission, other.mission)) {
            return false;
        }
        if (!Objects.equals(this.focus, other.focus)) {
            return false;
        }
        if (!Objects.equals(this.neighborhood, other.neighborhood)) {
            return false;
        }
        if (!Objects.equals(this.coordinator, other.coordinator)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
