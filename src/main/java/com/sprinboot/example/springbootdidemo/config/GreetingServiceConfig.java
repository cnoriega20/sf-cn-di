package com.sprinboot.example.springbootdidemo.config;

import com.sprinboot.example.springbootdidemo.services.GreetingService;
import com.sprinboot.example.springbootdidemo.services.base.greeting.BaseLanguageGreeting;
import com.sprinboot.example.springbootdidemo.services.factory.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(BaseLanguageGreeting baseLanGreeting){
        return new GreetingServiceFactory(baseLanGreeting);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService invokePrimaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService invokePrimarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService invokePrimaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }
}
