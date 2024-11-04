package org.cab_invoice_generator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateFareTest {

    CalculateFare calculateFare = new CalculateFare();

    @Test
    public void testNormalCalculateTotalFare() {

        double expected = 100.0;

        double actual = calculateFare.normalCalculateTotalFare(5.0, 50);

        Assert.assertEquals(expected, actual);


    }

}
