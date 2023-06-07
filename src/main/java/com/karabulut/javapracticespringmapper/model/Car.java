package com.karabulut.javapracticespringmapper.model;

import lombok.*;

@Data
@Builder
public class Car {
    private int id;
    private String make;
    private String model;
}