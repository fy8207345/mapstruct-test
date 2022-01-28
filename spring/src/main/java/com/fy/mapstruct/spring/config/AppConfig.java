package com.fy.mapstruct.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.fy.mapstruct.spring")
public class AppConfig {

    @Bean
    public ConversionServiceFactoryBean conversionService(){
        return new ConversionServiceFactoryBean();
    }
}
