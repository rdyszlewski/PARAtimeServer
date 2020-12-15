package com.parabbits.PARAtime.persistence.project;

import com.parabbits.PARAtime.persistence.kanban_column.KanbanColumn;

import java.util.ArrayList;
import java.util.List;

public class InsertProjectDTO {

    private Project insertedProject;
    private List<Project> updatedProject = new ArrayList<>();
    private KanbanColumn insertedKanbanColumn;
    private List<KanbanColumn> updatedKanbanColumns = new ArrayList<>();

    public InsertProjectDTO(Project insertedProject){
        this.insertedProject = insertedProject;
    }

    public Project getInsertedProject() {
        return insertedProject;
    }

    public void setInsertedProject(Project insertedProject) {
        this.insertedProject = insertedProject;
    }

    public List<Project> getUpdatedProject() {
        return updatedProject;
    }

    public void setUpdatedProject(List<Project> updatedProject) {
        this.updatedProject = updatedProject;
    }

    public KanbanColumn getInsertedKanbanColumn() {
        return insertedKanbanColumn;
    }

    public void setInsertedKanbanColumn(KanbanColumn insertedKanbanColumn) {
        this.insertedKanbanColumn = insertedKanbanColumn;
    }

    public List<KanbanColumn> getUpdatedKanbanColumns() {
        return updatedKanbanColumns;
    }

    public void setUpdatedKanbanColumns(List<KanbanColumn> updatedKanbanColumns) {
        this.updatedKanbanColumns = updatedKanbanColumns;
    }
}
