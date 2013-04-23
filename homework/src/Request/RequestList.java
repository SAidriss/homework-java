/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Request;

import java.util.*;

/**
 * RequestList is the list that contains all the requests made
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class RequestList {
   
    private List <Request> requests;
    /**
     * Constructor of a the list of requests
     */
    public RequestList() {
       requests = new ArrayList <Request> (); 
    }
    /**
     * Adds a request to the request list
     * @param r 
     */
    public void addRequest (Request r){
        requests.add(r);
    }
    /**
     * 
     * Deletes a request from the message list
     * @param r
     * @return index
     */
    public Request deleteRequest (Request r){
        int index = searchRequest(r);
        return requests.remove(index);
    }
    /**
     * searchRequest searches for a specific request between all the requests that are in the request list
     * @param r
     * @return the index of the place where the message was stored 
     */
    public int searchRequest (Request r){
        return requests.indexOf(r);
    }
    /**
     *  Sort the members corresponding to the specification of the user 
     * @param cmp 
     */
    public void sortRequests (Comparator cmp){
      Collections.sort(requests, cmp);
     }
    /**
     * toString method prints out all the existing members
     * @return 
     */
    @Override
    public String toString(){
        String str= "" ;
         Iterator <Request> Iter = requests.iterator();
         while(Iter.hasNext()){
          Request r = Iter.next();
          str += r.toString() + "\n";
        }
      return str;
    }
    
    /**
     * this behavior modify attributes of the corresponding class
     * @param <T> this generic helps to accept any type of parameter change, hence we can change any type
     * @param oldreq this is the member that we need to change his informations
     * @param mewreq this is the member that we have to replace with
     */
    public void modifyRequest(Request oldreq, Request mewreq) {
        
        int index = searchRequest(oldreq);
        
        if(index >= 0)
        {
            deleteRequest(requests.get(index));
            addRequest(mewreq);
        }
    }
    
}
 
