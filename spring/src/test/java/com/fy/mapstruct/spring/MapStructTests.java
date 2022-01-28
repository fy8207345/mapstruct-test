package com.fy.mapstruct.spring;

import com.fy.mapstruct.spring.config.AppConfig;
import com.fy.mapstruct.spring.config.ConversionServiceAdapter;
import com.fy.mapstruct.spring.model.Car;
import com.fy.mapstruct.spring.model.CarDto;
import com.fy.mapstruct.spring.model.CarType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class MapStructTests {

    @Autowired
    private ConversionService conversionService;

    @Test
    public void name() {
        Car car = new Car("hello", 5, CarType.SEDAN);
        CarDto convert = conversionService.convert(car, CarDto.class);
        System.out.println(convert);
    }
}
