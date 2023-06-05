package com.stuff.ideal.repositories;

import com.stuff.ideal.models.Rate;
import com.stuff.ideal.models.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {
}
