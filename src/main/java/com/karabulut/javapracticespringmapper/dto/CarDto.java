package com.karabulut.javapracticespringmapper.dto;

import lombok.*;

@Data
@Builder
public class CarDto {
    private String make;
    private String model;
}