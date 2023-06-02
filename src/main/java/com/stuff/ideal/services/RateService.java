package com.stuff.ideal.services;

import com.stuff.ideal.models.Rate;
import com.stuff.ideal.repositories.RateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RateService {
    private final RateRepository rateRepository;

    public List<Rate> showAllRate(){
        return rateRepository.findAll();
    }

    public Rate showRateByCity(String city){
        return rateRepository.findByCity(city);
    }
}
