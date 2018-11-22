package com.example.ventas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.entity.InvoiceEntity;
import com.example.ventas.repository.InvoiceRepository;
import com.example.ventas.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService{
	
	@Autowired
	InvoiceRepository invoiceRepository;

	@Override
	public List<InvoiceEntity> getAllInvoice() {
		return invoiceRepository.findAll();
	}

}
