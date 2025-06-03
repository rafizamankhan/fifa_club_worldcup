package com.fcwc.fcwc.controller;

import com.fcwc.fcwc.model.Team;
import com.fcwc.fcwc.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    // Get  /api/teams
    @GetMapping
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    // Get /api/teams/group/{group}
    @GetMapping("/group/{group}")
    public List<Team> getTeamsByGroup(@PathVariable String group) {
        return teamService.getTeamsByGroup(group);
    }

    
}
