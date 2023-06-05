package com.stuff.ideal.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "request")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Request {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "type")
    @NotEmpty(message = "Выберите тип грузоперевозки")
    private String type;
    @Column(name = "city1")
    @NotEmpty(message = "Выберите пункт отправления")
    private String city1;
    @Column(name = "city2")
    @NotEmpty(message = "Выберите пункт назначения")
    private String city2;
    @Column(name = "weight")
    @Min(value = 30, message = "Минимальный вес 30 кг")
    private float weight;
    @Column(name = "length")
    @Positive(message = "Укажите длинну")
    private float length;
    @Column(name = "width")
    @Positive(message = "Укажите ширину")
    private float width;
    @Column(name = "height")
    @Positive(message = "Укажите высоту")
    private float height;
    @Column(name = "count")
    @Min(value = 1, message = "Укажите количество мест")
    private int count;
    @Column(name = "email")
    @NotEmpty(message = "Укажите почту")
    @Email
    private String email;
    @Column(name = "phone")
    @NotEmpty(message = "Укажите номер телефона")
    @Pattern(regexp = "^(\\+7|8|7)\\d{10}$", message = "Неверный формат номера телефона")
    private String phone;
}
