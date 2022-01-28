package com.fy.mapstruct.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Car {
    private String make;
    private int numberOfSeats;
    private CarType type;

}
