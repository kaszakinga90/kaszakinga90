package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User userMillenials = new Millenials("Zenek");
        User userYGeneration = new YGeneration("Jadwiga");
        User userZGeneration = new ZGeneration("Hilda");

        //When
        String snapchat = userMillenials.sharePost();
        String twitter = userYGeneration.sharePost();
        String facebook = userZGeneration.sharePost();

        //Then
        Assert.assertEquals("Snapchat", snapchat);
        Assert.assertEquals("Twitter", twitter);
        Assert.assertEquals("Facebook", facebook);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User userZGeneration = new ZGeneration("Hilda");
        userZGeneration.setSocialPublisher(new SnapchatPublisher());

        //When
        String snapchat = userZGeneration.sharePost();

        //Then
        Assert.assertEquals("Snapchat", snapchat);
    }
}
