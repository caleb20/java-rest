package com.example.ventas.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class InvoiceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_inv")
	private Long idInvoice;

	@Column(name = "id_cus")
	private Long idCustomer;

	@Column(name = "date_inv")
	private Date dateInvoice;

	@Column(name = "total_products_inv")
	private int totalProductsInvoice;

	@Column(name = "total_pay_inv")
	private double totalPayInvoice;

	@Column(name = "pre_pay_inv")
	private double prePayInvoice;

	@Column(name = "status_products_inv")
	private boolean statusProductsInvoice;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "id_inv")
	private List<DetailInvoiceEntity> invoices = new ArrayList<>();

	public Long getIdInvoice() {
		return idInvoice;
	}

	public void setIdInvoice(Long idInvoice) {
		this.idInvoice = idInvoice;
	}

	public Long getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}

	public Date getDateInvoice() {
		return dateInvoice;
	}

	public void setDateInvoice(Date dateInvoice) {
		this.dateInvoice = dateInvoice;
	}

	public int getTotalProductsInvoice() {
		return totalProductsInvoice;
	}

	public void setTotalProductsInvoice(int totalProductsInvoice) {
		this.totalProductsInvoice = totalProductsInvoice;
	}

	public double getTotalPayInvoice() {
		return totalPayInvoice;
	}

	public void setTotalPayInvoice(double totalPayInvoice) {
		this.totalPayInvoice = totalPayInvoice;
	}

	public double getPrePayInvoice() {
		return prePayInvoice;
	}

	public void setPrePayInvoice(double prePayInvoice) {
		this.prePayInvoice = prePayInvoice;
	}

	public boolean isStatusProductsInvoice() {
		return statusProductsInvoice;
	}

	public void setStatusProductsInvoice(boolean statusProductsInvoice) {
		this.statusProductsInvoice = statusProductsInvoice;
	}

	public List<DetailInvoiceEntity> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<DetailInvoiceEntity> invoices) {
		this.invoices = invoices;
	}

	@Override
	public String toString() {
		return "InvoiceEntity [idInvoice=" + idInvoice + ", idCustomer=" + idCustomer + ", dateInvoice=" + dateInvoice
				+ ", totalProductsInvoice=" + totalProductsInvoice + ", totalPayInvoice=" + totalPayInvoice
				+ ", prePayInvoice=" + prePayInvoice + ", statusProductsInvoice=" + statusProductsInvoice
				+ ", invoices=" + invoices + "]";
	}

}
