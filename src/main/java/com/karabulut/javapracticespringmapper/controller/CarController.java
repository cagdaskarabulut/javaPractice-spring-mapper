package com.karabulut.javapracticespringmapper.controller;

import com.karabulut.javapracticespringmapper.dto.CarDto;
import com.karabulut.javapracticespringmapper.mapper.CarMapper;
import com.karabulut.javapracticespringmapper.model.Car;
import com.karabulut.javapracticespringmapper.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/test-Car")
    public Car testCar(){
        CarDto newCarDto = new CarDto();
        newCarDto.setMake("Audi");
        newCarDto.setModel("A4");
        return carService.testForCarDtoToCar(newCarDto);
    }

    @GetMapping("/test-CarDto")
    public CarDto testCarDto(){
        Car newCar = new Car();
        newCar.setId(1);
        newCar.setMake("Audi");
        newCar.setModel("A5");
        return carService.testForCarToCarDto(newCar);
    }


}
