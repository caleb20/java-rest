package com.example.ventas.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.dto.out.DetailInvoiceOut;
import com.example.ventas.dto.out.InvoiceOut;
import com.example.ventas.entity.InvoiceEntity;
import com.example.ventas.repository.InvoiceRepository;
import com.example.ventas.service.CustomerService;
import com.example.ventas.service.InvoiceService;
import com.example.ventas.service.ProductService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	InvoiceRepository invoiceRepository;

	@Autowired
	CustomerService customerService;

	@Autowired
	ProductService productService;

	@Override
	public List<InvoiceOut> getAllInvoice() {

		List<InvoiceEntity> invoicesEntity = invoiceRepository.findAll();

		List<InvoiceOut> invoicesOut = new ArrayList<>();

		invoicesEntity.forEach(invoices -> {
			InvoiceOut invoiceOut = new InvoiceOut();
			invoiceOut.setIdInvoice(invoices.getIdInvoice().intValue());
			invoiceOut.setNameCustomer(customerService.getById(invoices.getIdCustomer()).getNameCustomer());
			invoiceOut.setDateInvoice(invoices.getDateInvoice());
			invoiceOut.setTotalProductsInvoice(invoices.getTotalProductsInvoice());
			invoiceOut.setTotalPayInvoice(invoices.getTotalPayInvoice());
			invoiceOut.setPrePayInvoice(invoices.getPrePayInvoice());

			List<DetailInvoiceOut> detailsInvoiceOut = new ArrayList<>();

			invoices.getDetailInvoice().forEach(detailsInvoice -> {
				DetailInvoiceOut detailInvoiceOut = new DetailInvoiceOut();
				detailInvoiceOut.setIdDetailInvoice(detailsInvoice.getIdDetailInvoice().intValue());
				detailInvoiceOut.setNameProduct(
						productService.getById(Long.valueOf(detailsInvoice.getIdProduct())).getDescriptionProduct());
				detailInvoiceOut.setQuantityDetail(detailsInvoice.getQuantityDetail());
				detailInvoiceOut.setPriceInvoice(detailsInvoice.getPriceInvoice());
				detailsInvoiceOut.add(detailInvoiceOut);
			});

			invoiceOut.setDetailInvoice(detailsInvoiceOut);
			invoicesOut.add(invoiceOut);

		});

		return invoicesOut;
	}

	@Override
	public List<InvoiceEntity> getAlInvoiceEntity() {
		return invoiceRepository.findAll();
	}

}
