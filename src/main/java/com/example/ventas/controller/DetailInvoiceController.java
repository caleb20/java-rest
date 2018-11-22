package com.example.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ventas.entity.DetailInvoiceEntity;
import com.example.ventas.service.DetailInvoiceService;

@RestController
@RequestMapping("rest")
public class DetailInvoiceController {

	@Autowired
	DetailInvoiceService detailInvoiceService;
	
	@GetMapping("/detailInvoices")
	public List<DetailInvoiceEntity> getAllDetailInvoice(){
		return detailInvoiceService.getAllDetailInvoice();
	}
	
}
