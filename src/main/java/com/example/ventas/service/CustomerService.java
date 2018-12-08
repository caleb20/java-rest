package com.example.ventas.service;

import java.util.List;

import com.example.ventas.dto.in.CustomerIn;
import com.example.ventas.dto.out.CustomerOut;
import com.example.ventas.entity.CustomerEntity;

public interface CustomerService {

	List<CustomerOut> findAll();
	CustomerOut save(CustomerIn customer);
	CustomerEntity findById(Long idCustomer);
}
