package com.capgemini.capstore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CustomerDetail", uniqueConstraints = { @UniqueConstraint(columnNames = { "email", "mobileNo" }) })
@SequenceGenerator(name = "custseq", initialValue = 10000, allocationSize = 1000)
public class Customer extends User {

	@Id
	@Column(name = "customerId")
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custseq")
	private int customerId;
	@Column(name = "customerName")
	@NotNull
	private String customerName;
	@Column(name = "email")
	@NotNull
	private String customerEmail;
	@Column(name = "mobileNo")
	@NotNull
	private String customerMobileNumber;
	@OneToOne
	@NotNull
	private Address customerAddress;
	@Column(name = "pincode")
	@NotNull
	private String customerPincode;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPincode() {
		return customerPincode;
	}

	public void setCustomerPincode(String customerPincode) {
		this.customerPincode = customerPincode;
	}

}
