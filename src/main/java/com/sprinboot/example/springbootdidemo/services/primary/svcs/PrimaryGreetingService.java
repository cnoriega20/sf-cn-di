package com.sprinboot.example.springbootdidemo.services.primary.svcs;

import com.sprinboot.example.springbootdidemo.services.GreetingService;
import com.sprinboot.example.springbootdidemo.services.base.greeting.BaseLanguageGreeting;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


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
