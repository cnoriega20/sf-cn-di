package com.sprinboot.example.springbootdidemo.services.factory;

import com.sprinboot.example.springbootdidemo.services.GreetingService;
import com.sprinboot.example.springbootdidemo.services.base.greeting.BaseLanguageGreeting;
import com.sprinboot.example.springbootdidemo.services.primary.svcs.PrimaryGermanGreetingService;
import com.sprinboot.example.springbootdidemo.services.primary.svcs.PrimaryGreetingService;
import com.sprinboot.example.springbootdidemo.services.primary.svcs.PrimarySpanishGreetingService;

public class GreetingServiceFactory {

    private BaseLanguageGreeting baseLanguageGreeting;


    public GreetingServiceFactory(BaseLanguageGreeting baseLanguageGreeting) {
        this.baseLanguageGreeting = baseLanguageGreeting;
    }

    public GreetingService createGreetingService (String lang){
        switch (lang){
            case "en":
                return new PrimaryGreetingService(baseLanguageGreeting);

            case "de":
                return new PrimaryGermanGreetingService(baseLanguageGreeting);

            case "es":
                return new PrimarySpanishGreetingService(baseLanguageGreeting);

            default:
                return new PrimaryGreetingService(baseLanguageGreeting);
        }
    }
}
