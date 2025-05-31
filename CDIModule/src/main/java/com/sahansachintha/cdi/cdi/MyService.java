package com.sahansachintha.cdi.cdi;

import jakarta.enterprise.context.RequestScoped;

//@ApplicationScoped
@RequestScoped
public class MyService {
    public void doSomething() {
        System.out.println("MyService Do Something");
    }
}
