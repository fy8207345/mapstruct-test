package com.fy.mapstruct.spring.config;

import org.mapstruct.MapperConfig;
import org.mapstruct.extensions.spring.SpringMapperConfig;

@MapperConfig(componentModel = "spring", uses = ConversionServiceAdapter.class)
@SpringMapperConfig(conversionServiceBeanName = "myConversionService")
public class MapperSpringConfig {
}
