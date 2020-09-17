package com.sprinboot.example.springbootdidemo.services;

import org.springframework.stereotype.Service;

//@Service
/*
* Exception:
* ***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of method setGreetingService in
*  com.sprinboot.example.springbootdidemo.controllers.GetterInjectedController
* required a bean of type 'com.sprinboot.example.springbootdidemo.services.GreetingService'
* that could not be found.

Action:

Consider defining a bean of type 'com.sprinboot.example.springbootdidemo.services.GreetingService'
* in your configuration.
Process finished with exit code 1
* Solution: add @Service

* */
@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO = "Hello guys! - Original";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
