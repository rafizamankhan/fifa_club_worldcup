package com.fcwc.fcwc.service;

import com.fcwc.fcwc.model.Fixture;
import com.fcwc.fcwc.repository.FixtureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class FixtureService {

    private final FixtureRepository fixtureRepository;

    @Autowired
    public FixtureService(FixtureRepository fixtureRepository) {
        this.fixtureRepository = fixtureRepository;
    }

    // Get all fixtures
    public List<Fixture> getAllFixtures() {
        return fixtureRepository.findAll();
    }

    // Get fixtures by date
    public List<Fixture> getFixturesByDate(LocalDate date) {
        return fixtureRepository.findByMatchDate(date);
    }
}
