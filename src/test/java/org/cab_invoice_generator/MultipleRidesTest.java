package org.cab_invoice_generator;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class MultipleRidesTest {
    MultipleRides multipleRides = new MultipleRides();

    @Test
    public void total(){
        double expected = 601.0;
        LinkedList<Double> rides = multipleRides.calculateTotal();
        double total = 0;
        for (Double d : rides){
            total+=d;
        }
        double actual = total;

        Assert.assertEquals(expected,actual);

    }
}
