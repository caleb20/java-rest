package com.example.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ventas.dto.out.CategoryOut;
import com.example.ventas.service.CategoryService;

@RestController
@RequestMapping("rest")
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@GetMapping("/categories")
	public List<CategoryOut> getAllCategories() {
		return categoryService.findAll();
	}

	@GetMapping("/category")
	public List<CategoryOut> getCategoyByNameCategory(@RequestParam(value = "name") String nameCategory) {
		return categoryService.findByNameCategory(nameCategory);
	}
}
