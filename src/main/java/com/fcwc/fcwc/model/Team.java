package com.fcwc.fcwc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "teams")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long teamId;
    
    @Column(name = "team_name", nullable = false)
    private String teamName;
    
    @Column(name = "team_group")
    private String teamGroup;
    
    @Column(name = "team_initial")
    private String teamInitial;
}
