package com.example.ventas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ventas.entity.DepartmentEntity;
import com.example.ventas.service.DepartmentService;

@RestController
@RequestMapping("rest")
public class DepartmentController {

	@Autowired
	DepartmentService deparmentService;

	@GetMapping("/departments")
	public List<DepartmentEntity> getDepartmentAll() {
		return deparmentService.getAllDepartment();
	}

	@GetMapping("/department/{id}")
	public Optional<DepartmentEntity> getDepartmentById(@PathVariable("id") Long id) {
		return deparmentService.getDepartmentById(id);
	}

	@PostMapping("/department/new")
	public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity dep) {
		return deparmentService.createDepartment(dep);
	}
	
	@PostMapping("/department/update/{id}")
	public DepartmentEntity updateDepartment(@PathVariable("id") Long id, @RequestBody DepartmentEntity dep) {
		return deparmentService.updateDepartment(id, dep);
	}
	
	@DeleteMapping("/department/delete/{id}")
	public DepartmentEntity deleteDepartment(@PathVariable("id") Long id) {
		return deparmentService.deleteDepartment(id);
	}
}
