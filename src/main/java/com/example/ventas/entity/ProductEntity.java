package com.example.ventas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pro")
	private Long idProduct;

	@Column(name = "description_pro")
	private String descriptionProduct;

	@Column(name = "price_pro")
	private double priceProduct;

	@Column(name = "stock_pro")
	private String stockProduct;

	@Column(name = "id_cat")
	private Long idCategory;

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getDescriptionProduct() {
		return descriptionProduct;
	}

	public void setDescriptionProduct(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public String getStockProduct() {
		return stockProduct;
	}

	public void setStockProduct(String stockProduct) {
		this.stockProduct = stockProduct;
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	@Override
	public String toString() {
		return "ProductEntity [idProduct=" + idProduct + ", descriptionProduct=" + descriptionProduct
				+ ", priceProduct=" + priceProduct + ", stockProduct=" + stockProduct + ", idCategory=" + idCategory
				+ "]";
	}

}
