package com.fcwc.fcwc.service;

import com.fcwc.fcwc.model.Team;
import com.fcwc.fcwc.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    // Get all teams
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    // Get teams by group
    public List<Team> getTeamsByGroup(String group) {
        return teamRepository.findByGroup(group);
    }

    



}
