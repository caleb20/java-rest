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
	public List<DepartmentEntity> findAll() {
		return departmentRepository.findAll();
	}

	@Override
	public Optional<DepartmentEntity> findById(Long id) {
		return departmentRepository.findById(id);
	}

	@Override
	public DepartmentEntity save(DepartmentEntity dep) {
		return departmentRepository.save(dep);
	}

	@Override
	public DepartmentEntity update(Long id, DepartmentEntity dep) {
		Optional<DepartmentEntity> depar = findById(id);
		depar.get().setNameDepartment(dep.getNameDepartment());
		departmentRepository.save(depar.get());
		return findById(id).get();
	}

	@Override
	public DepartmentEntity deleteById(Long id) {
		Optional<DepartmentEntity> depar = findById(id);
		departmentRepository.deleteById(id);
		return depar.get();
	}

}
