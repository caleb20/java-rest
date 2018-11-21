package com.example.ventas.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.dto.CustomerDTO;
import com.example.ventas.entity.CustomerEntity;
import com.example.ventas.repository.CustomerRepository;
import com.example.ventas.service.CustomerService;
import com.example.ventas.service.DeparmentService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	DeparmentService departmentService;
	
	@Override
	public List<CustomerDTO> getAllCustomer() {
		List<CustomerEntity> customersEntity = customerRepository.findAll();

		List<CustomerDTO> customersDTO = new ArrayList<>();

		for (CustomerEntity customerEntity : customersEntity) {
			CustomerDTO cus = new CustomerDTO();
			cus.setNameCustomer(customerEntity.getNameCustomer());
			cus.setLastNameCustomer(customerEntity.getLastNameCustomer());
			cus.setNameDepartment(departmentService.findDepartmentById(customerEntity.getIdDepartment()).get().getNameDepartment());
			customersDTO.add(cus);
		}

		return customersDTO;

	}

}