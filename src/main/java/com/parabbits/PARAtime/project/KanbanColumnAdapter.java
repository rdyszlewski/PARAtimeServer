package com.parabbits.PARAtime.project;

import com.parabbits.PARAtime.persistence.kanban_column.KanbanColumn;

public class KanbanColumnAdapter {

    public static KanbanColumnDTO entityToDTO(KanbanColumn column){
        KanbanColumnDTO dto = new KanbanColumnDTO();
        dto.setId(column.getId());
        dto.setName(column.getName());
        dto.setProjectId(column.getProject().getId());
        dto.setHead(column.isHead());
        dto.setSuccessor(column.getSuccessor());

        return dto;
    }
}
