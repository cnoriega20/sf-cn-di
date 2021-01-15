package com.sprinboot.example.springbootdidemo;

import com.sprinboot.example.springbootdidemo.externalization.DummyDatasource;
import com.sprinboot.example.springbootdidemo.externalization.DummyJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringbootDiDemoApplication.class, args);
        DummyDatasource dummyDatasource = (DummyDatasource)ctx.getBean(DummyDatasource.class);
        DummyJmsBroker dummyJmsBroker = (DummyJmsBroker)ctx.getBean(DummyJmsBroker.class);

        System.out.println("Printing from datasource.properties...");
        System.out.println(dummyDatasource.getUsername());
        System.out.println(dummyDatasource.getPassword());
        System.out.println(dummyDatasource.getUrl());

        System.out.println("Printing from jms.properties...");
        System.out.println(dummyJmsBroker.getUsername());
        System.out.println(dummyJmsBroker.getPassword());
        System.out.println(dummyJmsBroker.getUrl());
    }

}
