package org.cab_invoice_generator;

import java.util.LinkedList;

public class MultipleRides {


    CalculateFare calculateFare = new CalculateFare();

    public LinkedList<Double> calculateTotal(){

        LinkedList<Double> rides = new LinkedList<>();

        double passenger1 = calculateFare.normalCalculateTotalFare(2.0, 10);
        rides.add(passenger1);
        double passenger2 = calculateFare.normalCalculateTotalFare(7.0, 40);
        rides.add(passenger2);
        double passenger3 = calculateFare.normalCalculateTotalFare(8.0, 55);
        rides.add(passenger3);
        double passenger4 = calculateFare.normalCalculateTotalFare(10.0, 91);
        rides.add(passenger4);
        double passenger5 = calculateFare.normalCalculateTotalFare(9.0, 45);
        rides.add(passenger5);


        return rides;
    }

}
