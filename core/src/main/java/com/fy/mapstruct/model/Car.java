package com.fy.mapstruct.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {
    private String make;
    private int numberOfSeats;
    private CarType type;
}
