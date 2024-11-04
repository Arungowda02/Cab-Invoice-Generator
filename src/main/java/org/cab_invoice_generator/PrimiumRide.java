package org.cab_invoice_generator;

public class PrimiumRide {
    CalculateFare calculateFare = new CalculateFare();

    public double normalRide(){
        double total = calculateFare.normalCalculateTotalFare(5, 30);
        return total;
    }

    public double premiumRide(){
        double total = calculateFare.premiumCalculateTotalFare(5, 30);
        return total;
    }
}
