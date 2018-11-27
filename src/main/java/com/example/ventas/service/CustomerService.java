package com.example.ventas.service;

import java.util.List;
import java.util.Optional;

import com.example.ventas.dto.in.CustomerIn;
import com.example.ventas.dto.out.CustomerOut;
import com.example.ventas.entity.CustomerEntity;

public interface CustomerService {

	List<CustomerOut> getAllCustomer();
	CustomerOut saveCustomer(CustomerIn customer);
	CustomerEntity getById(Long idCustomer);
}
