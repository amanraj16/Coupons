package com.capgemini.capstore.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "MerchantDetail", uniqueConstraints = { @UniqueConstraint(columnNames = { "email", "mobileNo" }) })
@SequenceGenerator(name = "mercseq", initialValue = 2000, allocationSize = 100)
public class Merchant extends User {

	@Id
	@Column(name = "merchantId")
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mercseq")
	private int merchantId;
	@Column(name = "merchantName")
	@NotNull
	private String merchantName;
	@Column(name = "email")
	@NotNull
	private String merchantEmail;
	@Column(name = "mobileNo")
	@NotNull
	private String merchantMobileNumber;
	@OneToOne
	@NotNull
	private Address merchantAddress;
	@Column(name = "storeName")
	private String merchantStoreName;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Product> products;

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantEmail() {
		return merchantEmail;
	}

	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}

	public String getMerchantMobileNumber() {
		return merchantMobileNumber;
	}

	public void setMerchantMobileNumber(String merchantMobileNumber) {
		this.merchantMobileNumber = merchantMobileNumber;
	}

	public Address getMerchantAddress() {
		return merchantAddress;
	}

	public void setMerchantAddress(Address merchantAddress) {
		this.merchantAddress = merchantAddress;
	}

	public String getMerchantStoreName() {
		return merchantStoreName;
	}

	public void setMerchantStoreName(String merchantStoreName) {
		this.merchantStoreName = merchantStoreName;
	}

}
