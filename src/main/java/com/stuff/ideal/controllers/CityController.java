package com.stuff.ideal.controllers;

import com.stuff.ideal.models.Rate;
import com.stuff.ideal.services.RateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class CityController {
    private final RateService rateService;

    @GetMapping("/request/{transportType}")
    public List<String> getCities(@PathVariable("transportType") String transportType){
        List<String> cities = new ArrayList<>();
        if (transportType.equals("air_type")) {
            List<Rate> rates = rateService.showAllRate();
            rates.stream().forEach(city -> cities.add(city.getCity()));
        } else if (transportType.equals("road_type")) {
            cities.add("Город 3");
            cities.add("Город 4");
        } else if (transportType.equals("select")) {
            cities.add("Выбрать");
        }
        return cities;
    }
}
