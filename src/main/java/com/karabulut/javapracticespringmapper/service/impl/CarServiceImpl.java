package com.karabulut.javapracticespringmapper.service.impl;

import com.karabulut.javapracticespringmapper.dto.CarDto;
import com.karabulut.javapracticespringmapper.mapper.CarMapper;
import com.karabulut.javapracticespringmapper.model.Car;
import com.karabulut.javapracticespringmapper.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {

    private final CarMapper mapper;

    @Override
    public CarDto testForCarToCarDto(Car car) {
        return mapper.toCarDto(car);
    }

    @Override
    public Car testForCarDtoToCar(CarDto carDto) {
        return mapper.toCar(carDto);
    }
}
