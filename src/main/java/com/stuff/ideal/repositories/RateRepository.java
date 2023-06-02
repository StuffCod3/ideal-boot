package com.stuff.ideal.repositories;

import com.stuff.ideal.models.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RateRepository extends JpaRepository<Rate, Integer> {
//    Optional<Rate> findByCity();
    Rate findByCity(String city);
}
