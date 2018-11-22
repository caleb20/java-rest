package com.example.ventas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.entity.CategoryEntity;
import com.example.ventas.repository.CategoryRepository;
import com.example.ventas.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<CategoryEntity> getAllCategory() {
		return categoryRepository.findAll();
	}
	
}
