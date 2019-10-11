package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(ChooseRoll.WITH_SEZAME)
                .burgers(2)
                .sauce(ChooseSauce.THOUSAND_ISLANDS)
                .ingredient(ChooseIngredients.CHEESE)
                .ingredient(ChooseIngredients.CHILI_PEPPERS)
                .ingredient(ChooseIngredients.ONION)
                .ingredient(ChooseIngredients.BACON)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        ChooseRoll kindOfBun = bigmac.getBun();
        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(ChooseRoll.WITH_SEZAME, bigmac.getBun());
    }
}
