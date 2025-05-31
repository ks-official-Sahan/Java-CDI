package com.sahansachintha.cdi;

import com.sahansachintha.cdi.annotation.Email;
import com.sahansachintha.cdi.cdi.NotificationService;
import com.sahansachintha.cdi.remote.UserRegistration;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class UserRegistrationSessionBean implements UserRegistration {

    @Inject
    @Email
    private NotificationService notificationService;

    @Override
    public void registerUser(String firstname, String lastname, String email, String password) {
        notificationService.sendNotification("Hello " + firstname + " " + lastname + ", Your " + email + " has been registered!");
    }
}