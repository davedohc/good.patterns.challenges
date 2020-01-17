package com.kodilla.good.patterns.challenges.orderService;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Email regarding order sent to " + user.getName() + " " + user.getSurname());
    }
}
