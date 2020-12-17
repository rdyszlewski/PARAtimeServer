package com.parabbits.PARAtime.project;

public class KanbanColumnDTO {
    private Long id;
    private String name;
    private Long projectId;
    private boolean isDefault;
    private Long successor;
    private boolean head;


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

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
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
