package com.example.ventas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.entity.DepartmentEntity;
import com.example.ventas.repository.DepartmentRepository;
import com.example.ventas.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public List<DepartmentEntity> getAllDepartment() {
		return departmentRepository.findAll();
	}

	@Override
	public Optional<DepartmentEntity> getDepartmentById(Long id) {
		return departmentRepository.findById(id);
	}

	@Override
	public DepartmentEntity createDepartment(DepartmentEntity dep) {
		return departmentRepository.save(dep);
	}

	@Override
	public DepartmentEntity updateDepartment(Long id, DepartmentEntity dep) {
		Optional<DepartmentEntity> depar = getDepartmentById(id);
		depar.get().setNameDepartment(dep.getNameDepartment());
		departmentRepository.save(depar.get());
		return getDepartmentById(id).get();
	}

	@Override
	public DepartmentEntity deleteDepartment(Long id) {
		Optional<DepartmentEntity> depar = getDepartmentById(id);
		departmentRepository.deleteById(id);
		return depar.get();
	}

}
