package com.fcwc.fcwc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Team {
    @Id
    private Long id;
    private String name;
    private String group;
    private String displayName;

    public Team() {}

    public Team(Long id, String name, String group, String displayName) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.displayName = displayName;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getGroup() {return group;}
    public void setGroup(String group) {this.group = group;}

    public String getDisplayName() {return displayName;}
    public void setDisplayName(String displayName) {this.displayName = displayName;}

}
