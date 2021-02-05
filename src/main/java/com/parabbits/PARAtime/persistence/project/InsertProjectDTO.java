package com.parabbits.PARAtime.persistence.project;

import com.parabbits.PARAtime.persistence.kanban_column.KanbanColumn;
import com.parabbits.PARAtime.project.ProjectDTO;

import java.util.ArrayList;
import java.util.List;

public class InsertProjectDTO {

    private ProjectDTO insertedProject;
    private List<ProjectDTO> updatedProject = new ArrayList<>();
    // TODO: tutaj zmienić typ danych na DTO
    private KanbanColumn insertedKanbanColumn;
    private List<KanbanColumn> updatedKanbanColumns = new ArrayList<>();

    public InsertProjectDTO(ProjectDTO insertedProject){
        this.insertedProject = insertedProject;
    }

    public ProjectDTO getInsertedProject() {
        return insertedProject;
    }

    public void setInsertedProject(ProjectDTO insertedProject) {
        this.insertedProject = insertedProject;
    }

    public List<ProjectDTO> getUpdatedProject() {
        return updatedProject;
    }

    public void setUpdatedProject(List<ProjectDTO> updatedProject) {
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
