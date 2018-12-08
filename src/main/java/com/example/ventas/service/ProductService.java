package com.example.ventas.service;

import java.util.List;

import com.example.ventas.entity.ProductEntity;

public interface ProductService {

	List<ProductEntity> findAll();
	ProductEntity findById(Long idProduct);
	
}
