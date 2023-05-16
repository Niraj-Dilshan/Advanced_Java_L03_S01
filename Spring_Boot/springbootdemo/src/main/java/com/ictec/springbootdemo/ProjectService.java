package com.ictec.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    private ProjectEntityRepository projectEntityRepository;

    public List<ProjectEntity> getAllProjects() {
        return (List<ProjectEntity>) projectEntityRepository.findAll();
    }

    public ProjectEntity getProjectById(Long id) {
        Optional<ProjectEntity> project = projectEntityRepository.findById(Math.toIntExact(id));
        if (project.isPresent()) {
            return project.get();
        }
        throw new IllegalArgumentException("Invalid project id: " + id);
    }

    public void addProject(ProjectEntity project) {
        projectEntityRepository.save(project);
    }

    public void updateProject(Long id, ProjectEntity updatedProject) {
        Optional<ProjectEntity> project = projectEntityRepository.findById(Math.toIntExact(id));
        if (project.isPresent()) {
            ProjectEntity existingProject = project.get();
            existingProject.setTitle(updatedProject.getTitle());
            existingProject.setCordinator(updatedProject.getCordinator());
            projectEntityRepository.save(existingProject);
        } else {
            throw new IllegalArgumentException("Invalid project id: " + id);
        }
    }

    public void deleteProject(Long id) {
        projectEntityRepository.deleteById(Math.toIntExact(id));
    }
}
