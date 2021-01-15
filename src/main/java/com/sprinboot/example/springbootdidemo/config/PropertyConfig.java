package com.sprinboot.example.springbootdidemo.config;

import com.sprinboot.example.springbootdidemo.externalization.DummyDatasource;
import com.sprinboot.example.springbootdidemo.externalization.DummyJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class PropertyConfig {
    @Value("${cn.username}")
    String username;

    @Value("${cn.password}")
    String password;

    @Value("${cn.githuburl}")
    String url;

    @Value("${cn.jms.username}")
    String jmsUsername;

    @Value("${cn.jms.password}")
    String jmsPassword;

    @Value("${cn.jms.githuburl}")
    String jmsUrl;

    @Bean
    public DummyDatasource dummyDatasource(){
        DummyDatasource dummyDatasource = new DummyDatasource();
        dummyDatasource.setUsername(username);
        dummyDatasource.setPassword(password);
        dummyDatasource.setUrl(url);
        return dummyDatasource;
    }

    @Bean
    public DummyJmsBroker dummyJmsBroker(){
        DummyJmsBroker dummyJmsBroker = new DummyJmsBroker();
        dummyJmsBroker.setUsername(jmsUsername);
        dummyJmsBroker.setPassword(jmsPassword);
        dummyJmsBroker.setUrl(jmsUrl);
        return dummyJmsBroker;
    }


}

