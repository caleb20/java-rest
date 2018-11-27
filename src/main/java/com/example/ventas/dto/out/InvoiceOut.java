package com.example.ventas.dto.out;

import java.util.Date;
import java.util.List;

public class InvoiceOut {

	private int idInvoice;
	private String nameCustomer;
	private Date dateInvoice;
	private int totalProductsInvoice;
	private double totalPayInvoice;
	private double prePayInvoice;
	private List<DetailInvoiceOut> detailInvoice;

	public int getIdInvoice() {
		return idInvoice;
	}

	public void setIdInvoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
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

	public List<DetailInvoiceOut> getDetailInvoice() {
		return detailInvoice;
	}

	public void setDetailInvoice(List<DetailInvoiceOut> detailInvoice) {
		this.detailInvoice = detailInvoice;
	}

	@Override
	public String toString() {
		return "InvoiceOut [idInvoice=" + idInvoice + ", nameCustomer=" + nameCustomer + ", dateInvoice=" + dateInvoice
				+ ", totalProductsInvoice=" + totalProductsInvoice + ", totalPayInvoice=" + totalPayInvoice
				+ ", prePayInvoice=" + prePayInvoice + ", detailInvoice=" + detailInvoice + "]";
	}

}
