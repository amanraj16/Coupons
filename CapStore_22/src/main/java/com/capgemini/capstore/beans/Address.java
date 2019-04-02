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
@Table(name = "AddressDetail")
@SequenceGenerator(name = "addseq", initialValue = 3001, allocationSize = 1000)
public class Address {

	@Id
	@Column(name = "addressId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addseq")
	@NotNull
	private int addressId;
	@Column(name = "city")
	@NotNull
	private String city;
	@Column(name = "country")
	@NotNull
	private String country;
	@Column(name = "state")
	@NotNull
	private String state;
	@Column(name = "zipcode")
	@NotNull
	private String zipcode;
	@Column(name = "addressLine")
	private String addressLine;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

}
