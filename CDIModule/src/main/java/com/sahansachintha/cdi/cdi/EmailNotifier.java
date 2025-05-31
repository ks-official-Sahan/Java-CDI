package com.sahansachintha.cdi.cdi;

import com.sahansachintha.cdi.annotation.Email;
import jakarta.enterprise.context.ApplicationScoped;

@Email
@ApplicationScoped
public class EmailNotifier implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notifier: sending email: " + message);
    }
}
