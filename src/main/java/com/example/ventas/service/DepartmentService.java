package com.example.ventas.service;

import java.util.List;
import java.util.Optional;

import com.example.ventas.entity.DepartmentEntity;

public interface DepartmentService {

	List<DepartmentEntity> findAll();
	Optional<DepartmentEntity> findById(Long id);
	DepartmentEntity save(DepartmentEntity dep);
	DepartmentEntity update(Long id, DepartmentEntity dep);
	DepartmentEntity deleteById(Long id);
	
}
