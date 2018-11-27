package com.example.ventas.dto.out;

public class DetailInvoiceOut {

	private int idDetailInvoice;
	private String nameProduct;
	private int quantityDetail;
	private double priceInvoice;

	public int getIdDetailInvoice() {
		return idDetailInvoice;
	}

	public void setIdDetailInvoice(int idDetailInvoice) {
		this.idDetailInvoice = idDetailInvoice;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public int getQuantityDetail() {
		return quantityDetail;
	}

	public void setQuantityDetail(int quantityDetail) {
		this.quantityDetail = quantityDetail;
	}

	public double getPriceInvoice() {
		return priceInvoice;
	}

	public void setPriceInvoice(double priceInvoice) {
		this.priceInvoice = priceInvoice;
	}

	@Override
	public String toString() {
		return "DetailInvoice [idDetailInvoice=" + idDetailInvoice + ", nameProduct=" + nameProduct
				+ ", quantityDetail=" + quantityDetail + ", priceInvoice=" + priceInvoice + "]";
	}

}
