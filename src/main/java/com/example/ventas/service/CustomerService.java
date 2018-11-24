package com.example.ventas.service;

import java.util.List;

import com.example.ventas.dto.in.CustomerIn;
import com.example.ventas.dto.out.CustomerOut;

public interface CustomerService {

	List<CustomerOut> getAllCustomer();
	CustomerOut saveCustomer(CustomerIn customer);
	
}
