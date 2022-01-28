package com.fy.mapstruct.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CarDto {
    private String make;
    private int seatCount;
    private String type;
}
