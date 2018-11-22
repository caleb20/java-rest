package com.example.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ventas.entity.CategoryEntity;
import com.example.ventas.service.CategoryService;

@RestController
@RequestMapping("rest")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/categories")
	public List<CategoryEntity> getAllCategories(){
		return categoryService.getAllCategory();
	}
	
}
