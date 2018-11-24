package com.example.ventas.dto.in;

public class CustomerIn {

	private int idCustomer;
	private String nameCustomer;
	private String lastNameCustomer;
	private int idDepartment;

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
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

	public int getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	@Override
	public String toString() {
		return "CustomerIn [idCustomer=" + idCustomer + ", nameCustomer=" + nameCustomer + ", lastNameCustomer="
				+ lastNameCustomer + ", idDepartment=" + idDepartment + "]";
	}

}
