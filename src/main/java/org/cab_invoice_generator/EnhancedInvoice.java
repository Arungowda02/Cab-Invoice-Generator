package org.cab_invoice_generator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class EnhancedInvoice {

    public int totalRide(List<Double> rides){
        int totalRides = rides.size();

        return totalRides;
    }

    public double total(List<Double> rides){
        double total = 0.0;
        for(Double d : rides){
            total+=d;
        }
        return total;
    }

    public double average(List<Double> rides){
        double total = total(rides);
        int totalRides = totalRide(rides);
        return total/totalRides;
    }
}
