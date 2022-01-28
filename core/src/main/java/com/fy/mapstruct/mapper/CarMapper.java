package com.fy.mapstruct.mapper;

import com.fy.mapstruct.model.Car;
import com.fy.mapstruct.model.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToDto(Car car);
}
