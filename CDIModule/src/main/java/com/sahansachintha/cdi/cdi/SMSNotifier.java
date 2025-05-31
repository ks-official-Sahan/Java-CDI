package com.sahansachintha.cdi.cdi;

import com.sahansachintha.cdi.annotation.SMS;
import jakarta.enterprise.context.ApplicationScoped;

@SMS
@ApplicationScoped
public class SMSNotifier implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notifier: sending message: " + message);
    }
}
