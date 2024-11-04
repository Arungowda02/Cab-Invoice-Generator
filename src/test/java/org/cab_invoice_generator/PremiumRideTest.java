package org.cab_invoice_generator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PremiumRideTest {


    PrimiumRide primiumRide = new PrimiumRide();

    @Test
    public void testNormalRide(){
        double actual = primiumRide.normalRide();
        double expected = 80.0;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testPremiumRide(){
        double actual = primiumRide.premiumRide();
        double expected = 135.0;
        Assert.assertEquals(actual,expected);
    }
}
