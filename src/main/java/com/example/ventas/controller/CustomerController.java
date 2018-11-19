package com.example.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ventas.dto.CustomerDTO;
import com.example.ventas.service.CustomerService;

@RestController
@RequestMapping("rest")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers")
	public List<CustomerDTO> getAllCustomers(){
		return customerService.getAllCustomer();
	}
}
