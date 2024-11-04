package org.cab_invoice_generator.entity;

public class Rider {
    private int id;
    private double total;
    private int totalRides;
    private double avg;

    public Rider() {
    }

    public Rider(int id, double total, int totalRides, double avg) {
        this.id = id;
        this.total = total;
        this.totalRides = totalRides;
        this.avg = avg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getTotalRides() {
        return totalRides;
    }

    public void setTotalRides(int totalRides) {
        this.totalRides = totalRides;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "id=" + id +
                ", total=" + total +
                ", totalRides=" + totalRides +
                ", avg=" + avg +
                '}';
    }
}
