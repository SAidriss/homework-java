/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Message;

import java.util.*;

/**
 * MessageList is the list that contains all the messages
 * @author Mohammed Tahri Sqalli
 * @author Idriss Said Alaoui
 */
public class MessageList {
    
    private List<Message> messagelists;
            
    /**
     * constructor of a list of messages existing 
     */
    public MessageList()
    {
        messagelists = new LinkedList<Message>();
    }
    /**
     * Adds a message to the message list
     * @param m 
     */
    public void addMessage (Message m){
        messagelists.add(m); 
    }
    /**
     * Deletes a message from the message list
     * @param m 
     */
    public void deleteMessage (Message m){
        int index = searchMessage(m);
        messagelists.remove(index);
    }
     /**
      * toString method prints out all the existing members
      * @return String
      */ 
    @Override
    public String toString(){
        String str= "" ;
         Iterator <Message> Iter = messagelists.iterator();
         while(Iter.hasNext()){
          Message mess = Iter.next();
          str += mess.toString() + "\n";
        }
      return str;
    }
    /**
     * searchMessage searches for a specific message between all the messages that are in the message list
     * @param m
     * @return the index of the place where the message was stored
     */
    public int searchMessage(Message m)
    {
        return messagelists.indexOf(m);
    }
    
    /**
     * this behavior modify attributes of the corresponding class
     * @param oldmess this is the member that we need to change his informations
     * @param newmess this is the member that we have to replace with
     */
    public void modifyMember(Message oldmess, Message newmess) {
        
        int index = searchMessage(oldmess);
        
        if(index >= 0)
        {
            deleteMessage(messagelists.get(index));
            addMessage(newmess);
        }
    }
    
    /**
     * Sort the members corresponding to the specification of the user ( by name or balance)
     * @param comp comparator object
     */
    public void sortMessage(Comparator comp)
    {
        Collections.sort(messagelists, comp);
    }
}
