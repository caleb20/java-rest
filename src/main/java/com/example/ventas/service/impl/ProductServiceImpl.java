package com.example.ventas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.entity.ProductEntity;
import com.example.ventas.repository.ProductRepository;
import com.example.ventas.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<ProductEntity> getAllProduct() {
		return productRepository.findAll();
	}

}
