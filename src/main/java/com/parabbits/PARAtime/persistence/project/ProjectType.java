package com.parabbits.PARAtime.persistence.project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProjectType {

    @Id
    private Long id;

    private String name;

    public ProjectType(){

    }

    public ProjectType(Long id, String name){
        this.id = id;
        this.name = name;
    }
}
