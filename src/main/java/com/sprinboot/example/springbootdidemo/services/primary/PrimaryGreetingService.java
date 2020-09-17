package com.sprinboot.example.springbootdidemo.services.primary;

import com.sprinboot.example.springbootdidemo.services.GreetingService;
import com.sprinboot.example.springbootdidemo.services.base.greeting.BaseLanguageGreeting;


public class PrimaryGreetingService implements GreetingService {

    private BaseLanguageGreeting baseLanguageGreeting;

    public PrimaryGreetingService(BaseLanguageGreeting baseLanguageGreeting) {
        this.baseLanguageGreeting = baseLanguageGreeting;
    }


    @Override
    public String sayGreeting() {

        return baseLanguageGreeting.getEnglishGreeting();
    }

}
