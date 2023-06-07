package com.karabulut.javapracticespringmapper.mapper;

import com.karabulut.javapracticespringmapper.dto.CarDto;
import com.karabulut.javapracticespringmapper.model.Car;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {
    Car toCar(CarDto carDto);
    CarDto toCarDto(Car car);
}
