package com.sprinboot.example.springbootdidemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"}) //Default is activate when there are no other profiles active
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }

    /*
    * ***************************
        APPLICATION FAILED TO START
        ***************************

        Description:

        Parameter 0 of constructor in com.sprinboot.example.springbootdidemo.controllers.HelloController required a single bean, but 4 were found:
            - constructorGreetingService: defined in file [C:\Spring_Projects\springboot-di-demo\target\classes\com\sprinboot\example\springbootdidemo\services\ConstructorGreetingService.class]
            - getterGreetingService: defined in file [C:\Spring_Projects\springboot-di-demo\target\classes\com\sprinboot\example\springbootdidemo\services\GetterGreetingService.class]
            - greetingServiceImpl: defined in file [C:\Spring_Projects\springboot-di-demo\target\classes\com\sprinboot\example\springbootdidemo\services\GreetingServiceImpl.class]
            - primaryGreetingService: defined in file [C:\Spring_Projects\springboot-di-demo\target\classes\com\sprinboot\example\springbootdidemo\services\PrimaryGreetingService.class]


        Action:

        Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed


        Process finished with exit code 1

        Solution:
        Add @Primary to PrimaryGreetingService

    *
    * */
}
