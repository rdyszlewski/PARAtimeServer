package com.parabbits.PARAtime.persistence.kanban_column;

import com.parabbits.PARAtime.persistence.project.Project;
import com.parabbits.PARAtime.persistence.shared.Order;

import javax.persistence.*;

@Entity
public class KanbanColumn extends Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Project project;

    private boolean isDefault;

    // TODO: dodać zadania

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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
