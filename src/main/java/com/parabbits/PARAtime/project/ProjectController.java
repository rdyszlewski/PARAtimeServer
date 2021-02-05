package com.parabbits.PARAtime.project;

import com.parabbits.PARAtime.persistence.project.InsertProjectDTO;
import com.parabbits.PARAtime.persistence.project.Project;
import com.parabbits.PARAtime.persistence.project.ProjectFilter;
import com.parabbits.PARAtime.persistence.project.ProjectRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/projects", produces = "application/json")
public class ProjectController {

    @Autowired
    private ModelMapper modelMapper;

    private ProjectRepository repository;

    @Autowired
    public ProjectController(ProjectRepository projectRepository){
        this.repository = projectRepository;
    }

    @GetMapping()
    public List<ProjectDTO> getAll(){
        List<Project> projects = (List<Project>) repository.findAll();
        return projects.stream().map(this::mapProjectToDTO).collect(Collectors.toList());
    }

    @GetMapping()
    public List<ProjectDTO> getByFilter(@RequestBody ProjectFilter filter){
        // TODO: wstawić tutaj project filter

        return null;
    }

    private ProjectDTO mapProjectToDTO(Project project){
        return modelMapper.map(project, ProjectDTO.class);
    }

    @GetMapping(path = "/{id}")
    public ProjectDTO getById(@PathVariable Long id){
        Optional<Project> project = repository.findById(id);
        return project.map(this::mapProjectToDTO).orElse(new ProjectDTO());
        // TODO: tutaj zwrócić informacje o braku zasobu
    }

    @PostMapping()
    public InsertProjectDTO insert(@RequestBody ProjectDTO projectDTO){
        Project project = modelMapper.map(projectDTO, Project.class);
        Project insertedProject = repository.save(project);
        ProjectDTO insertedDTO =  mapProjectToDTO(insertedProject);
        return new InsertProjectDTO(insertedDTO);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id){
        Project project = new Project();
        project.setId(id);
        repository.delete(project);
    }

    @PutMapping()
    public InsertProjectDTO update(@RequestBody ProjectDTO projectDTO){
        Project project = mapDTOtoProject(projectDTO);
        Project updatedProject = repository.save(project);
        // TODO: po dodaniu kolejności zmienić zwracany typ danych
        ProjectDTO updatedDTO = mapProjectToDTO(updatedProject);
        return new InsertProjectDTO(updatedDTO);
    }

    private Project mapDTOtoProject(ProjectDTO projectDTO){
        return modelMapper.map(projectDTO, Project.class);
    }
}
