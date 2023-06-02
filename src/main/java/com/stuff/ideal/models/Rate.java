package com.stuff.ideal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rate")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rate {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "city")
    private String city;
    @Column(name = "code_AK")
    private String code;
    @Column(name = "min_weight")
    private int min_weight;
    @Column(name = "weight50")
    private int weight50;
    @Column(name = "weight51_100")
    private int weight51_100;
    @Column(name = "weight101_500")
    private int weight101_500;
    @Column(name = "weight501_1000")
    private int weight501_1000;
    @Column(name = "weight1000")
    private int weight1000;
}
