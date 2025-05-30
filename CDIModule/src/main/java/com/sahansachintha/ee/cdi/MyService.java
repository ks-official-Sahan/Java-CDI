package com.sahansachintha.ee.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;

//@ApplicationScoped
@RequestScoped
public class MyService {
    public void doSomething() {
        System.out.println("MyService Do Something");
    }
}
