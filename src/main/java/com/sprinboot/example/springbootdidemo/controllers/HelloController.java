package com.sprinboot.example.springbootdidemo.controllers;

import com.sprinboot.example.springbootdidemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
    private GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }

    /*
    *       ***************************
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
