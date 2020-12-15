package com.parabbits.PARAtime.persistence.kanban_column;

import com.parabbits.PARAtime.persistence.project.Project;

import javax.persistence.*;

@Entity
public class KanbanColumn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Project project;

    private boolean isDefault;

    // TODO: dodać zadania

}
