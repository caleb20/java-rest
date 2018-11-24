package com.example.ventas.dto.out;

public class CustomerOut {

	private int idCustomer;
	private String nameCustomer;
	private String lastNameCustomer;
	private String nameDepartment;

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

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	@Override
	public String toString() {
		return "CustomerOut [idCustomer=" + idCustomer + ", nameCustomer=" + nameCustomer + ", lastNameCustomer="
				+ lastNameCustomer + ", nameDepartment=" + nameDepartment + "]";
	}

}
