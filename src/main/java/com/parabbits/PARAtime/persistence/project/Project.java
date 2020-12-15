package com.parabbits.PARAtime.persistence.project;

import com.parabbits.PARAtime.persistence.models.Status;
import com.parabbits.PARAtime.persistence.shared.Order;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "projects")
public class Project extends Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Date startDate;
    private Date endDate;

    @Enumerated(EnumType.ORDINAL)
    private ProjectType type;

    @Enumerated(EnumType.ORDINAL)
    private Status status;

    // TODO: wstawić usera
    // TODO: wstawić kolejność

    public Project(){

    }

    public Project(String name){
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}