package com.example.ventas.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.dto.out.CategoryOut;
import com.example.ventas.entity.CategoryEntity;
import com.example.ventas.repository.CategoryRepository;
import com.example.ventas.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<CategoryOut> findAll() {
		List<CategoryEntity> categoriesEntity = categoryRepository.findAll();

		List<CategoryOut> categoriesIn = new ArrayList<>();

		categoriesEntity.forEach(categoryEntity -> {
			CategoryOut categoryIn = new CategoryOut();
			categoryIn.setId(categoryEntity.getId());
			categoryIn.setNameCategory(categoryEntity.getNameCategory());
			categoryIn.setDescriptionCategory(categoryEntity.getDescriptionCategory());
			categoriesIn.add(categoryIn);
		});

		return categoriesIn;
	}

	@Override
	public List<CategoryOut> findByNameCategory(String nameCategory) {
		List<CategoryEntity> categoriesEntity = categoryRepository.findByNameCategoryContaining(nameCategory);

		List<CategoryOut> categoriesIn = new ArrayList<>();

		categoriesEntity.forEach(categoryEntity -> {
			CategoryOut categoryIn = new CategoryOut();
			categoryIn.setId(categoryEntity.getId());
			categoryIn.setNameCategory(categoryEntity.getNameCategory());
			categoryIn.setDescriptionCategory(categoryEntity.getDescriptionCategory());
			categoriesIn.add(categoryIn);
		});

		return categoriesIn;
	}

}
