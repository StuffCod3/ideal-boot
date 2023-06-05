package com.stuff.ideal.services;

import com.stuff.ideal.models.Rate;
import com.stuff.ideal.models.Request;
import com.stuff.ideal.repositories.RateRepository;
import com.stuff.ideal.repositories.RequestRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestService {
    private final RequestRepository requestRepository;

    public void createReq(Request request){
        requestRepository.save(request);
    }
}
