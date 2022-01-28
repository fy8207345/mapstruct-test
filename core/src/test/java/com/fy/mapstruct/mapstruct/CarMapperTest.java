package com.fy.mapstruct.mapstruct;

import com.fy.mapstruct.mapper.CarMapper;
import com.fy.mapstruct.model.Car;
import com.fy.mapstruct.model.CarDto;
import com.fy.mapstruct.model.CarType;
import org.junit.Assert;
import org.junit.Test;

public class CarMapperTest {

    @Test
    public void name() {

        Car car = new Car("Morries", 5, CarType.SEDAN);
//
        CarDto carDto = CarMapper.INSTANCE.carToDto(car);
//
        Assert.assertNotNull(carDto);
        Assert.assertEquals(carDto.getMake(), "Morries");
        Assert.assertEquals(carDto.getSeatCount(), 5);
        Assert.assertEquals(carDto.getType(), "SEDAN");
    }
}
