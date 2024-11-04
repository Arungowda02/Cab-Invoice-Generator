package org.cab_invoice_generator;

import org.cab_invoice_generator.entity.Rider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class InvoiceServiceTest {

    InvoiceService invoiceService = new InvoiceService();

    @Test
    public void testInvoiceService(){
        Rider rider = invoiceService.saveRiderHistory();

        Rider actual = invoiceService.getInvoice(1);
        HashMap<Integer, Rider> riders = invoiceService.riders;
        Rider expected = riders.get(1);

        Assert.assertEquals(actual,expected);

    }
}
