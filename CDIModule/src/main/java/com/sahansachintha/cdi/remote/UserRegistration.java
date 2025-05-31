package com.sahansachintha.cdi.remote;

import jakarta.ejb.Remote;

@Remote
public interface UserRegistration {
    void registerUser(String firstname, String lastname, String email, String password);
}
