package com.karabulut.javapracticespringmapper.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {
    private int id;
    private String make;
    private String model;
}