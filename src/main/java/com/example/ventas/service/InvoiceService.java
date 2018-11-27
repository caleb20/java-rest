package com.example.ventas.service;

import java.util.List;

import com.example.ventas.dto.out.InvoiceOut;
import com.example.ventas.entity.InvoiceEntity;

public interface InvoiceService {

	List<InvoiceOut> getAllInvoice();
	List<InvoiceEntity> getAlInvoiceEntity();
}
