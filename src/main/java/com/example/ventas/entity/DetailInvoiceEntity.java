package com.example.ventas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detail_invoice")
public class DetailInvoiceEntity {

	@Column(name = "id_det")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long idDetailInvoice;

	@Column(name = "id_inv")
	private Long idInvoice;

	@Column(name = "id_pro")
	private int idProduct;

	@Column(name = "quantity_det")
	private int quantityDetail;

	@Column(name = "price_inv")
	private double priceInvoice;

	public Long getIdDetailInvoice() {
		return idDetailInvoice;
	}

	public void setIdDetailInvoice(Long idDetailInvoice) {
		this.idDetailInvoice = idDetailInvoice;
	}

	public Long getIdInvoice() {
		return idInvoice;
	}

	public void setIdInvoice(Long idInvoice) {
		this.idInvoice = idInvoice;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
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
		return "DetailInvoiceEntity [idDetailInvoice=" + idDetailInvoice + ", idInvoice=" + idInvoice + ", idProduct="
				+ idProduct + ", quantityDetail=" + quantityDetail + ", priceInvoice=" + priceInvoice + "]";
	}

}
