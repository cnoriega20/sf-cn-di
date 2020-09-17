package com.sprinboot.example.springbootdidemo;

import com.sprinboot.example.springbootdidemo.controllers.ConstructorInjectedController;
import com.sprinboot.example.springbootdidemo.controllers.GetterInjectedController;
import com.sprinboot.example.springbootdidemo.controllers.HelloController;
import com.sprinboot.example.springbootdidemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringbootDiDemoApplication.class, args);
        HelloController helloController = ctx.getBean("helloController", HelloController.class);
        //helloController.greeting();

        System.out.println(ctx.getBean(HelloController.class).sayHello());

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        /*
        * Exception 1:
        * Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException:
        * No qualifying bean of type 'com.sprinboot.example.springbootdidemo.controllers.PropertyInjectedController'
        *  available
        * Solution:
        * 1. Add @Controller in PropertyInjectedController
        *       Exception 2:
        *       Exception in thread "main" java.lang.NullPointerException
	            at com.sprinboot.example.springbootdidemo.controllers.
	    *       PropertyInjectedController.sayHello(PropertyInjectedController.java:11)
	    *       Solution
	    *        1.1 Add @Autowired annotation in PropertyInjectedController
	    *         @Autowired
                    public GreetingServiceImpl greetingService;
        *
        * */

        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        /*
        * Exception:
        * Exception in thread "main" java.lang.NullPointerException
	     * at com.sprinboot.example.springbootdidemo.controllers.GetterInjectedController.sayHello(GetterInjectedController.java:11)
	     * Solution:
	     * Add @Autowired to the set method in GetterInjectedController
        *
        * */


        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}
