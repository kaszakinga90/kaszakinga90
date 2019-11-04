package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("3/KO/12/2019");

        Product pencil = new Product("pencil");
        Product scissors = new Product("scissors");
        Product oilPastels = new Product("oil pastels");
        Product rubber = new Product("rubber");

        Item iPencil = new Item(pencil, new BigDecimal(2), 3);
        Item iScissors = new Item(scissors, new BigDecimal(5), 1);
        Item iOilPastels = new Item(oilPastels, new BigDecimal(14), 1);
        Item iRubber = new Item(rubber, new BigDecimal(3), 2);

        iPencil.setInvoice(invoice);
        iScissors.setInvoice(invoice);
        iOilPastels.setInvoice(invoice);
        iRubber.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(iPencil);
        items.add(iScissors);
        items.add(iOilPastels);
        items.add(iRubber);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSize = invoice.getItems().size();

        Invoice invoiceReadFromDB = invoiceDao.findById(invoiceId);

        //Then
        Assert.assertEquals(invoiceId, invoiceReadFromDB.getId());
        Assert.assertEquals(4, itemSize);
        Assert.assertEquals(itemSize, invoiceReadFromDB.getItems().size());

        //Clean-up
        invoiceDao.delete(invoice);
    }
}
