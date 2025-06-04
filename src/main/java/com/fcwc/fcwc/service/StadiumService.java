package com.fcwc.fcwc.service;

import com.fcwc.fcwc.model.Stadium;
import com.fcwc.fcwc.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StadiumService {

    private final StadiumRepository stadiumRepository;

    @Autowired
    public StadiumService(StadiumRepository stadiumRepository) {
        this.stadiumRepository = stadiumRepository;
    }

    // Get all stadiums
    public List<Stadium> getAllStadiums() {
        return stadiumRepository.findAll();
    }
}