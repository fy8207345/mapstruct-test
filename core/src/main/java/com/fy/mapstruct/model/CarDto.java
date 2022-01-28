package com.fy.mapstruct.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CarDto {
    private String make;
    private int seatCount;
    private String type;
}
