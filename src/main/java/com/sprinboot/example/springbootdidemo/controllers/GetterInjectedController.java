package com.sprinboot.example.springbootdidemo.controllers;

import com.sprinboot.example.springbootdidemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService")GreetingService greetingService){
        this.greetingService = greetingService;
    }

    /*Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2020-08-08 21:06:48.309 ERROR 365696 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   :

***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of method setGreetingService in com.sprinboot.example.springbootdidemo.controllers.GetterInjectedController required a single bean, but 3 were found:
	- constructorGreetingService: defined in file [C:\Spring_Projects\springboot-di-demo\target\classes\com\sprinboot\example\springbootdidemo\services\ConstructorGreetingService.class]
	- getterGreetingService: defined in file [C:\Spring_Projects\springboot-di-demo\target\classes\com\sprinboot\example\springbootdidemo\services\GetterGreetingService.class]
	- greetingServiceImpl: defined in file [C:\Spring_Projects\springboot-di-demo\target\classes\com\sprinboot\example\springbootdidemo\services\GreetingServiceImpl.class]


Action:

Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed


Process finished with exit code 1
    *
    * */

}
