package com.example.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ventas.dto.in.CustomerIn;
import com.example.ventas.dto.out.CustomerOut;
import com.example.ventas.service.CustomerService;

@RestController
@RequestMapping("rest")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/customers")
	public List<CustomerOut> getAllCustomers() {
		return customerService.getAllCustomer();
	}

	@PostMapping("/customer/new")
	public CustomerOut saveCustomer(@RequestBody CustomerIn customerIn) {
		return customerService.saveCustomer(customerIn);
	}
}
