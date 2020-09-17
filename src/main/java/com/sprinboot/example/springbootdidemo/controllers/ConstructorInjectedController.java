package com.sprinboot.example.springbootdidemo.controllers;

import com.sprinboot.example.springbootdidemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    /*//Autowired annotation is Optional but even after Spring 4.2 spring framework enables automatic wiring of constructor base components
    * Spring see a constructor in a Spring component and try to satisfy dependencies.
    * */
    //@Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
/*
* Error
* ***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of constructor in com.sprinboot.example.springbootdidemo.controllers.ConstructorInjectedController required a single bean, but 3 were found:
	- constructorGreetingService: defined in file [C:\Spring_Projects\springboot-di-demo\target\classes\com\sprinboot\example\springbootdidemo\services\ConstructorGreetingService.class]
	- getterGreetingService: defined in file [C:\Spring_Projects\springboot-di-demo\target\classes\com\sprinboot\example\springbootdidemo\services\GetterGreetingService.class]
	- greetingServiceImpl: defined in file [C:\Spring_Projects\springboot-di-demo\target\classes\com\sprinboot\example\springbootdidemo\services\GreetingServiceImpl.class]


Action:

Consider marking one of the beans as @Primary,
* updating the consumer to accept multiple beans, or using
* @Qualifier to identify the bean that should be consumed


Process finished with exit code 1
*
* */