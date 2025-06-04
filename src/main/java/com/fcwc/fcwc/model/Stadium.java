package com.fcwc.fcwc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "stadiums")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stadium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stadium_id")
    private Long stadiumId;

    @Column(name = "stadium_name", nullable = false)
    private String stadiumName;

    @Column(name = "stadium_city", nullable = false)
    private String stadiumCity;

    @Column(name = "stadium_state", nullable = false)
    private String stadiumState;
}
