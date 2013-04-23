/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Request.Request;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Service {
    
    double time_dollar_spent;
    Date time_place;
    Request request;

    public Service(double time_dollar_spent, Date time_place, Request request) {
        this.time_dollar_spent = time_dollar_spent;
        this.time_place = time_place;
        this.request = request;
    }

    public double getTime_dollar_spent() {
        return time_dollar_spent;
    }

    public Date getTime_place() {
        return time_place;
    }

    public Request getRequest() {
        return request;
    }

    public void setTime_dollar_spent(double time_dollar_spent) {
        this.time_dollar_spent = time_dollar_spent;
    }

    public void setTime_place(Date time_place) {
        this.time_place = time_place;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Service other = (Service) obj;
        if (Double.doubleToLongBits(this.time_dollar_spent) != Double.doubleToLongBits(other.time_dollar_spent)) {
            return false;
        }
        if (!Objects.equals(this.time_place, other.time_place)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "ServiceList{" + "time_dollar_spent=" + time_dollar_spent + ", time_place=" + time_place + ", request=" + request + '}';
    }
    
    
    
}
