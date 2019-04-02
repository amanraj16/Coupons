package com.capgemini.capstore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "DummyOrder")
@SequenceGenerator(name = "ordseq", initialValue = 4001, allocationSize = 500)
public class DummyOrder {

	@Id
	@Column(name = "orderId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ordseq")
	@NotNull
	private int orderId;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
}
