package com.example.ventas.service;

import java.util.List;
import java.util.Optional;

import com.example.ventas.entity.DepartmentEntity;

public interface DeparmentService {

	List<DepartmentEntity> findAllDepartment();
	Optional<DepartmentEntity> findDepartmentById(Long id);
	DepartmentEntity createDepartment(DepartmentEntity dep);
	DepartmentEntity updateDepartment(Long id, DepartmentEntity dep);
	DepartmentEntity deleteDepartment(Long id);
	
}
