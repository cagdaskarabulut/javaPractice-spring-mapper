package com.karabulut.javapracticespringmapper.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarDto {
    private String make;
    private String model;
}