package com.sprinboot.example.springbootdidemo;

import com.sprinboot.example.springbootdidemo.controllers.ConstructorInjectedController;
import com.sprinboot.example.springbootdidemo.controllers.GetterInjectedController;
import com.sprinboot.example.springbootdidemo.controllers.HelloController;
import com.sprinboot.example.springbootdidemo.controllers.PropertyInjectedController;
import com.sprinboot.example.springbootdidemo.externalization.DummyDatasource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringbootDiDemoApplication.class, args);
        DummyDatasource dummyDatasource = (DummyDatasource)ctx.getBean(DummyDatasource.class);

        System.out.println(dummyDatasource.getUsername());
        System.out.println(dummyDatasource.getPassword());
        System.out.println(dummyDatasource.getUrl());
    }

}
