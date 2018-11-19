package com.example.ventas.dto;

public class CustomerDTO {

	private String nameCustomer;
	private String lastNameCustomer;
	private String nameDepartment;

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

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	@Override
	public String toString() {
		return "CustomerDTO [nameCustomer=" + nameCustomer + ", lastNameCustomer=" + lastNameCustomer
				+ ", nameDepartment=" + nameDepartment + "]";
	}

}
