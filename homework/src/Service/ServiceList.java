/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.*;

/**
 *
 * @author User
 */
public class ServiceList {
    
    private List<Service> messagelists;
            
    /**
     *a list of accounts existing in the database
     */
    public ServiceList()
    {
        messagelists = new ArrayList<Service>();
    }
    
    public void addService (Service s){
        messagelists.add(s); 
    }
    
    public void deleteService (Service s){
        int index = searchService(s);
        messagelists.remove(index);
    }
       
    @Override
    public String toString(){
        String str= "" ;
         Iterator <Service> Iter = messagelists.iterator();
         while(Iter.hasNext()){
          Service ser = Iter.next();
          str += ser.toString() + "\n";
        }
      return str;
    }
    
    public int searchService(Service s)
    {
        return messagelists.indexOf(s);
    }
    
    /**
     * this behavior modify attributes of the corresponding class
     * @param <T> this generic helps to accept any type of parameter change, hence we can change any type
     * @param oldser this is the member that we need to change his informations
     * @param newser this is the member that we have to replace with
     */
    public void modifyService(Service oldser, Service newser) {
        
        int index = searchService(oldser);
        
        if(index >= 0)
        {
            deleteService(messagelists.get(index));
            addService(newser);
        }
    }
    
    /**
     * Sort the members corresponding to the specification of the user ( by name or balance)
     * @param comp comparator object
     */
    public void sortService(Comparator comp)
    {
        Collections.sort(messagelists, comp);
    }
    
}