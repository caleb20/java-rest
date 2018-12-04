package com.example.ventas.key;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DetailInvoiceKeys implements Serializable {

	private static final long serialVersionUID = -6043916870919102539L;

	private Long idDetailInvoice;
	private Long idInvoice;

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

}
