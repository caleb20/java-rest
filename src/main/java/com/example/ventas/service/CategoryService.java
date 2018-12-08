package com.example.ventas.service;

import java.util.List;

import com.example.ventas.dto.out.CategoryOut;

public interface CategoryService {

	List<CategoryOut> findAll();
	
	List<CategoryOut> findByNameCategory(String nameCategory);
}
