package org.cab_invoice_generator;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class EnhancedInvoiceTest {
    EnhancedInvoice enhancedInvoice = new EnhancedInvoice();
    MultipleRides multipleRides = new MultipleRides();
    LinkedList<Double> rides = multipleRides.calculateTotal();
    @Test
    public void testTotal(){

        double expected = 601.0;

        double actual = enhancedInvoice.total(rides);

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testTotalRides(){
        int actual = enhancedInvoice.totalRide(rides);
        int expected = 5;
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testAverage(){
        double actual = enhancedInvoice.average(rides);
        double expected = 120.2;
        Assert.assertEquals(actual,expected);
    }

}
