package com.ictec.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	@Autowired
	private ProjectEntityRepository projectEntityRepository;

	@GetMapping("/")
	public String getAllProjects(Model model) {
		model.addAttribute("projects", projectEntityRepository.findAll());
		return "project-list";
	}

	@GetMapping("/projects/{id}")
	public String getProjectById(@PathVariable Long id, Model model) {
		ProjectEntity project = projectEntityRepository.findById(Math.toIntExact(id))
				.orElseThrow(() -> new IllegalArgumentException("Invalid project id: " + id));
		model.addAttribute("project", project);
		return "project-details";
	}

	@GetMapping("/projects/new")
	public String showAddProjectForm(Model model) {
		model.addAttribute("project", new ProjectEntity());
		return "add-project";
	}

	@PostMapping("/projects/add")
	public String addNewProject(@ModelAttribute ProjectEntity project) {
		projectEntityRepository.save(project);
		return "redirect:/";
	}

	@GetMapping("/projects/{id}/edit")
	public String showEditProjectForm(@PathVariable Long id, Model model) {
		ProjectEntity project = projectEntityRepository.findById(Math.toIntExact(id))
				.orElseThrow(() -> new IllegalArgumentException("Invalid project id: " + id));
		model.addAttribute("project", project);
		return "edit-project";
	}

	@PostMapping("/projects/{id}/edit")
	public String updateProject(@PathVariable Long id, @ModelAttribute ProjectEntity updatedProject) {
		ProjectEntity project = projectEntityRepository.findById(Math.toIntExact(id))
				.orElseThrow(() -> new IllegalArgumentException("Invalid project id: " + id));
		project.setTitle(updatedProject.getTitle());
		project.setCordinator(updatedProject.getCordinator());
		projectEntityRepository.save(project);
		return "redirect:/";
	}

	@GetMapping("/projects/{id}/delete")
	public String deleteProject(@PathVariable Long id) {
		projectEntityRepository.deleteById(Math.toIntExact(id));
		return "redirect:/";
	}
}
