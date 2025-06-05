package com.fcwc.fcwc.controller;

import com.fcwc.fcwc.model.Fixture;
import com.fcwc.fcwc.service.FixtureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/fixtures")
public class FixtureController {

    private final FixtureService fixtureService;

    @Autowired
    public FixtureController(FixtureService fixtureService) {
        this.fixtureService = fixtureService;
    }

    // Get all fixtures
    @GetMapping
    public List<Fixture> getAllFixtures() {
        return fixtureService.getAllFixtures();
    }

    // Get fixtures by date
    @GetMapping("/{date}")
    public List<Fixture> getFixturesByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return fixtureService.getFixturesByDate(date);
    }
}
