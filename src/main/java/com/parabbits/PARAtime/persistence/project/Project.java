package com.parabbits.PARAtime.persistence.project;

import com.parabbits.PARAtime.persistence.models.Status;
import com.parabbits.PARAtime.persistence.shared.Order;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "projects")
public class Project extends Order {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return name.equals(project.name) &&
                Objects.equals(description, project.description) &&
                Objects.equals(startDate, project.startDate) &&
                Objects.equals(endDate, project.endDate) &&
                type == project.type &&
                status == project.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, endDate, type, status);
    }
}