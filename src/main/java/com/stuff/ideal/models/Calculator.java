package com.stuff.ideal.models;

import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Calculator {
    @NotEmpty(message = "Выберите город")
    private String city;
    @Min(value = 30, message = "Минимальный вес 30 кг")
    private float weight;
//    @Min(value = 0, message = "Минимальная длина 1 м")
    @Positive(message = "Укажите длинну")
    private float length;
    @Positive(message = "Укажите ширину")
//    @Min(value = 1, message = "Минимальная ширина 1 м")
    private float width;
    @Positive(message = "Укажите высоту")
//    @Min(value = 1, message = "Минимальная высота 1 м")
    private float height;
    private float sum;
}
