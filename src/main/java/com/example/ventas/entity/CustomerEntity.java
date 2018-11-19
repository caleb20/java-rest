package com.example.ventas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity {

	@Id
	@Column(name = "id_cus")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCustomer;

	@Column(name = "name_cus")
	private String nameCustomer;

	@Column(name = "last_name_cus")
	private String lastNameCustomer;

	@Column(name = "id_dep")
	private Long idDepartment;

	public Long getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getLastNameCustomer() {
		return lastNameCustomer;
	}

	public void setLastNameCustomer(String lastNameCustomer) {
		this.lastNameCustomer = lastNameCustomer;
	}

	public Long getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(Long idDepartment) {
		this.idDepartment = idDepartment;
	}

	@Override
	public String toString() {
		return "CustomerEntity [idCustomer=" + idCustomer + ", nameCustomer=" + nameCustomer + ", lastNameCustomer="
				+ lastNameCustomer + ", idDepartment=" + idDepartment + "]";
	}

}
