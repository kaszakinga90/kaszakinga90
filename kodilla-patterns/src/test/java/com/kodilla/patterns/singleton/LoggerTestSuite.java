package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest() {
        //Given
        String log1 = "log1";
        String log2 = "log2";
        String log3 = "log3";
        String log4 = "log4";

        //When
        Logger.getInstance().log(log1);
        Logger.getInstance().log(log2);
        Logger.getInstance().log(log3);
        Logger.getInstance().log(log4);

        //Then
        Assert.assertEquals(log4, Logger.getInstance().getLastLog());
    }
}
