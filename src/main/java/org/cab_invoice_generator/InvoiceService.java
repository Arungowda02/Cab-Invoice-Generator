package org.cab_invoice_generator;

import org.cab_invoice_generator.entity.Rider;

import java.util.HashMap;
import java.util.LinkedList;

public class InvoiceService {

    Rider r = new Rider();
    HashMap<Integer, Rider> riders = new HashMap<>();
    CalculateFare calculateFare = new CalculateFare();
    EnhancedInvoice enhancedInvoice = new EnhancedInvoice();


    public Rider saveRiderHistory(){
        LinkedList<Double> list = new LinkedList<>();

        double p1 = calculateFare.normalCalculateTotalFare(10, 70);
        list.add(p1);
        double p2 = calculateFare.normalCalculateTotalFare(5, 30);
        list.add(p1);
        double p3 = calculateFare.normalCalculateTotalFare(1, 10);
        list.add(p1);

        double total = enhancedInvoice.total(list);
        int totalRides = enhancedInvoice.totalRide(list);
        double average = enhancedInvoice.average(list);



        riders.put(1,new Rider(1, total, totalRides, average));
        return new Rider(1, total, totalRides, average);
    }


    public Rider getInvoice(int id){

        return riders.get(id);

    }

}
