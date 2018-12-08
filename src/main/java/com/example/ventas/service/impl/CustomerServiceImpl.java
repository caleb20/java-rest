package com.example.ventas.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.dto.in.CustomerIn;
import com.example.ventas.dto.out.CustomerOut;
import com.example.ventas.entity.CustomerEntity;
import com.example.ventas.repository.CustomerRepository;
import com.example.ventas.service.CustomerService;
import com.example.ventas.service.DepartmentService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	DepartmentService departmentService;

	@Override
	public List<CustomerOut> findAll() {
		List<CustomerEntity> customersEntity = customerRepository.findAll();

		List<CustomerOut> customersOut = new ArrayList<>();

		customersEntity.forEach(customerEntity -> {
			CustomerOut customerOut = new CustomerOut();
			customerOut.setIdCustomer(customerEntity.getIdCustomer().intValue());
			customerOut.setNameCustomer(customerEntity.getNameCustomer());
			customerOut.setLastNameCustomer(customerEntity.getLastNameCustomer());
			customerOut.setNameDepartment(
					departmentService.findById(customerEntity.getIdDepartment()).get().getNameDepartment());
			customersOut.add(customerOut);
		});

		return customersOut;

	}

	@Override
	public CustomerOut save(CustomerIn customer) {
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setNameCustomer(customer.getNameCustomer());
		customerEntity.setLastNameCustomer(customer.getLastNameCustomer());
		customerEntity.setIdDepartment(Long.valueOf(customer.getIdDepartment()));

		CustomerEntity customerEntityOut = customerRepository.save(customerEntity);

		CustomerOut customerOut = new CustomerOut();
		customerOut.setIdCustomer(customerEntityOut.getIdCustomer().intValue());
		customerOut.setNameCustomer(customerEntityOut.getNameCustomer());
		customerOut.setLastNameCustomer(customerEntityOut.getLastNameCustomer());
		customerOut.setNameDepartment(departmentService.findById(Long.valueOf(customer.getIdDepartment()))
				.get().getNameDepartment());
		return customerOut;
	}

	@Override
	public CustomerEntity findById(Long idCustomer) {
		return customerRepository.findById(idCustomer).get();
	}

}
