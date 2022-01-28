package com.fy.mapstruct.spring.mapper;

import com.fy.mapstruct.spring.config.ConversionServiceAdapter;
import com.fy.mapstruct.spring.model.Car;
import com.fy.mapstruct.spring.model.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(uses = ConversionServiceAdapter.class)
public interface CarMapper extends Converter<Car, CarDto> {

    @Mapping(target = "seats", source = "seatConfiguration")
    CarDto convert(Car car);
}
