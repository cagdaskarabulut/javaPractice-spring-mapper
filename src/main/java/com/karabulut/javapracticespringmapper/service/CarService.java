package com.karabulut.javapracticespringmapper.service;

import com.karabulut.javapracticespringmapper.dto.CarDto;
import com.karabulut.javapracticespringmapper.model.Car;

public interface CarService {
    CarDto testForCarToCarDto(Car car);
    Car testForCarDtoToCar(CarDto carDto);
}
