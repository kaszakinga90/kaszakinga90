package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println(user.getUserName() + " Thanks for choose our shop. Hope you're back soon!");
    }
}