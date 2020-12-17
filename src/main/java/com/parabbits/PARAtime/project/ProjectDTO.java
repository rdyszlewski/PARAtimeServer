package com.parabbits.PARAtime.project;

import com.parabbits.PARAtime.persistence.models.Status;
import com.parabbits.PARAtime.persistence.project.ProjectType;

import java.sql.Date;

public class ProjectDTO {

    private Long id;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private Status status;
    private ProjectType type;
    private Long successor;
    private boolean head;

    public ProjectDTO(Long id, String name, Status status){
        this.id = id;
        this.name = name;
        this.status = status;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }

    public Long getSuccessor() {
        return successor;
    }

    public void setSuccessor(Long successor) {
        this.successor = successor;
    }

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }
}
