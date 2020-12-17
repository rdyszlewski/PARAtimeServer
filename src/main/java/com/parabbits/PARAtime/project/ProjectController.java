package com.parabbits.PARAtime.project;

import com.parabbits.PARAtime.persistence.project.InsertProjectDTO;
import com.parabbits.PARAtime.persistence.project.Project;
import com.parabbits.PARAtime.persistence.project.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/projects")
    public List<ProjectDTO> getAll(){
        List<Project> projects = (List<Project>) projectRepository.findAll();
        List<ProjectDTO> results = projects.stream().map(ProjectAdapter::entityToDto).collect(Collectors.toList());
        return results;
    }

    @PostMapping("/projects")
    public InsertProjectDTO insert(@RequestBody ProjectDTO projectDTO){
        Project project = ProjectAdapter.dtoToEntity(projectDTO);
        Project insertedProject = projectRepository.save(project);
        return new InsertProjectDTO(insertedProject);
    }
}
