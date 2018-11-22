package com.example.ventas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.entity.DetailInvoiceEntity;
import com.example.ventas.repository.DetailInvoiceRepository;
import com.example.ventas.service.DetailInvoiceService;

@Service
public class DetailInvoiceServiceImpl implements DetailInvoiceService{

	@Autowired
	DetailInvoiceRepository detailInvoiceRepository;
	
	@Override
	public List<DetailInvoiceEntity> getAllDetailInvoice() {
		return detailInvoiceRepository.findAll();
	}

}
