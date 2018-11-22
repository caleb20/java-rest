package com.example.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ventas.entity.InvoiceEntity;
import com.example.ventas.service.InvoiceService;

@RestController
@RequestMapping("rest")
public class InvoiceController {

	@Autowired
	InvoiceService invoiceService;

	@GetMapping("/invoices")
	public List<InvoiceEntity> getAllInvoice() {
		return invoiceService.getAllInvoice();
	}

}
