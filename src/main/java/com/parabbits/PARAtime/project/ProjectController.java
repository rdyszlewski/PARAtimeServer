package com.parabbits.PARAtime.project;

import com.parabbits.PARAtime.persistence.project.Project;
import com.parabbits.PARAtime.persistence.project.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/projects")
    public List<Project> all(){
        return projectRepository.findAll();
    }

}
