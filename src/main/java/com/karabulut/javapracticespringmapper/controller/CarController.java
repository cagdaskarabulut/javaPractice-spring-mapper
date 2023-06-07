package com.karabulut.javapracticespringmapper.controller;

import com.karabulut.javapracticespringmapper.dto.CarDto;
import com.karabulut.javapracticespringmapper.model.Car;
import com.karabulut.javapracticespringmapper.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/test-Car")
    public Car testCar(){
        var newCarDto = CarDto.builder().make("Audi").model("A4").build();
        return carService.testForCarDtoToCar(newCarDto);
    }

    @GetMapping("/test-CarDto")
    public CarDto testCarDto(){
        var newCar = Car.builder().id(1).make("Audi").model("A5").build();
        return carService.testForCarToCarDto(newCar);
    }


}
