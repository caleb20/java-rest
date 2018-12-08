package com.example.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ventas.entity.ProductEntity;
import com.example.ventas.service.ProductService;

@RestController
@RequestMapping("rest")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<ProductEntity> getAllProduct(){
		return productService.findAll();
	}
	
}
