package com.stuff.ideal.services;

import com.stuff.ideal.models.Calculator;
import com.stuff.ideal.models.Rate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class CalculatorService {

    private final RateService rateService;
    public float calcSum(Calculator calculator, String city){
        float sum = 0;

        Rate rate = rateService.showRateByCity(city);

        float v = calculator.getWidth() * calculator.getLength() * calculator.getHeight();
        float t = 0;
        
        if (calculator.getWeight() <= 50) {
            t = rate.getWeight50();
        } else if (calculator.getWeight() >= 51 && calculator.getWeight() <= 100) {
            t = rate.getWeight51_100();
        } else if (calculator.getWeight() >= 101 && calculator.getWeight() <= 500) {
            t = rate.getWeight101_500();
        } else if (calculator.getWeight() >= 501 && calculator.getWeight() <= 1000) {
            t = rate.getWeight501_1000();
        } else if (calculator.getWeight() >= 1000) {
            t = rate.getWeight501_1000();
        }

        if (v*167 > calculator.getWeight()){
            sum = (v * 167) * t + 850;
        }else {
            sum = calculator.getWeight() * t + 850;
        }
        return sum;
    }
}
