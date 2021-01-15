package com.sprinboot.example.springbootdidemo.config;

import com.sprinboot.example.springbootdidemo.externalization.DummyDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    @Value("${cn.username}")
    String username;

    @Value("${cn.password}")
    String password;

    @Value("${cn.githuburl}")
    String url;

    @Bean
    public DummyDatasource dummyDatasource(){
        DummyDatasource dummyDatasource = new DummyDatasource();
        dummyDatasource.setUsername(username);
        dummyDatasource.setPassword(password);
        dummyDatasource.setUrl(url);
        return dummyDatasource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}

