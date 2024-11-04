package org.cab_invoice_generator;

public class CalculateFare {

    public double normalCalculateTotalFare(double distance, int time){

        double cost = distance*10 + time*1;

        double minimumFare = 5.0;

        if(cost<minimumFare){
            return minimumFare;
        }else {
            return cost;
        }

    }

    public double premiumCalculateTotalFare(double distance, int time){

        double cost = distance*15 + time*2;

        double minimumFare = 20.0;

        if(cost<minimumFare){
            return minimumFare;
        }else {
            return cost;
        }

    }

}
