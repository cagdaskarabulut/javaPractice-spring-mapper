package com.karabulut.javapracticespringmapper.controller;

import com.karabulut.javapracticespringmapper.dto.CarDto;
import com.karabulut.javapracticespringmapper.mapper.CarMapper;
import com.karabulut.javapracticespringmapper.model.Car;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarMapper mapper;

    @GetMapping("/test-Car")
    public Car testCar(){
        var newCarDto = CarDto.builder().make("Audi").model("A4").build();
        return mapper.toCar(newCarDto);
    }

    @GetMapping("/test-CarDto")
    public CarDto testCarDto(){
        var newCar = Car.builder().id(1).make("Audi").model("A5").build();
        return mapper.toCarDto(newCar);
    }


}
