package com.parabbits.PARAtime.project;

import com.parabbits.PARAtime.persistence.project.Project;

public class ProjectAdapter {

    public static Project dtoToEntity(ProjectDTO projectDTO){
        Project project = new Project(projectDTO.getName());
        project.setId(projectDTO.getId());
        project.setDescription(projectDTO.getDescription());
        project.setStartDate(projectDTO.getStartDate());
        project.setEndDate(projectDTO.getEndDate());
        project.setStatus(projectDTO.getStatus());
        project.setType(projectDTO.getType());

        project.setHead(projectDTO.isHead());
        project.setSuccessor(projectDTO.getSuccessor());
        // TODO: pomyśleć jak zrobić z informacjami o kolejności
        return project;
    }

    public static ProjectDTO entityToDto(Project project){
        ProjectDTO dto = new ProjectDTO(project.getId(), project.getName(), project.getStatus());
        dto.setDescription(project.getDescription());
        dto.setStartDate(project.getStartDate());
        dto.setEndDate(project.getEndDate());
        dto.setType(project.getType());
        dto.setSuccessor(project.getSuccessor());
        dto.setHead(project.isHead());

        return dto;
    }
}
